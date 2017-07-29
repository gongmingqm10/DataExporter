package net.gongmingqm10.exporter;

import net.gongmingqm10.exporter.exception.FilePathException;
import net.gongmingqm10.exporter.model.Backing;
import net.gongmingqm10.exporter.model.Project;
import net.gongmingqm10.exporter.model.Visit;
import net.gongmingqm10.exporter.util.AppConfig;
import net.gongmingqm10.exporter.util.Parser;
import org.flywaydb.core.Flyway;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;

public class App {

    private final static String RAW_DATA_FOLDER = "/Users/mingong/Desktop/raw/";
    private final static String ARCHIVE_DATA_FOLDER = "/Users/mingong/Desktop/archieve/";
    private final ClassLoader classLoader = getClass().getClassLoader();

    private App() {
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public void run() {
        flywayMigrate();
        unzipRawData();
        processRowData();
    }

    private void unzipRawData() {
        File archieveDataFolder = new File(ARCHIVE_DATA_FOLDER);
        if (!archieveDataFolder.isDirectory()) {
            throw new FilePathException("The archieve data folder is not a directory");
        }
        File rawDataFolder = new File(RAW_DATA_FOLDER);
        if (rawDataFolder.exists()) {
            rawDataFolder.delete();
        }
        rawDataFolder.mkdirs();

        Stream.of(archieveDataFolder.listFiles())
                .forEach(file -> {
                    byte[] buffer = new byte[1024];
                    try {
                        GZIPInputStream gzis = new GZIPInputStream(new FileInputStream(file));
                        String originalFileName = file.getName().substring(0, file.getName().indexOf("."));
                        FileOutputStream out = new FileOutputStream(new File(rawDataFolder, originalFileName));
                        int len;
                        while ((len = gzis.read(buffer)) > 0) {
                            out.write(buffer, 0, len);
                        }
                        gzis.close();
                        out.close();
                        System.out.println("Unzip file " + originalFileName + " is done.");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                });
        System.out.print("Unzip the archieve folder is successful");
    }

    private void processRowData() {
        File rawDataFolder = new File(RAW_DATA_FOLDER);
        File[] files = rawDataFolder.listFiles();
        Stream.of(files).filter(file -> {
            boolean isVisited = SqliteMgr.getInstance().isFileVisited(file.getName());
            return !isVisited;
        }).forEach(this::processBackingFile);
    }

    private void processBackingFile(File file) {
        String fileName = file.getName();
        boolean isBackingFile = fileName.contains("backing");
        List<Backing> backingList = new ArrayList<>();
        List<Project> projectList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                if (isBackingFile) {
                    backingList.add(Parser.transformRowBacking(line));
                } else {
                    projectList.add(Parser.transformRowProject(line));
                }
            }
            if (isBackingFile) {
                SqliteMgr.getInstance().createBacking(backingList.stream().filter(Objects::nonNull).collect(Collectors.toList()));
            } else {
                SqliteMgr.getInstance().createProject(projectList.stream().filter(Objects::nonNull).collect(Collectors.toList()));
            }
            SqliteMgr.getInstance().createVisit(new Visit(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SqliteMgr.getInstance().close();
        }
    }

    private void flywayMigrate() {
        Flyway flyway = new Flyway();
        flyway.setDataSource(AppConfig.DB_URL, null, null);
        flyway.migrate();
    }
}

