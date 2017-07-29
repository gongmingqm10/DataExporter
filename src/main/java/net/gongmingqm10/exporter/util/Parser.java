package net.gongmingqm10.exporter.util;

import net.gongmingqm10.exporter.model.Backing;
import net.gongmingqm10.exporter.model.Project;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parser {

    public static Backing transformRowBacking(String rawBacking) {
        try {
            if (StringUtils.isEmpty(rawBacking)) {
                return null;
            }
            List<String> rawFields = processRawLine(rawBacking);

            if (rawFields.size() != 5) {
                return null;
            }
            Date date = parseDate(rawFields.get(2));

            return new Backing(rawFields.get(0), rawFields.get(1), date, rawFields.get(3), parseDouble(rawFields.get(4)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Date parseDate(String rawDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(rawDate);
    }

    public  static Project transformRowProject(String rawProject) {
        try {
            if (StringUtils.isEmpty(rawProject)) {
                return null;
            }
            List<String> rawFields = processRawLine(rawProject);

            if (rawFields.size() != 25) {
                return null;
            }

            Project project = new Project();
            project.setCode1(rawFields.get(0));
            project.setCode2(rawFields.get(1));
            project.setLaunchFrom(parseDate(rawFields.get(2)));
            project.setLaunchTo(parseDate(rawFields.get(3)));
            project.setQuantity1(parseInteger(rawFields.get(4)));
            project.setTitle(rawFields.get(5));
            project.setShortTitle(rawFields.get(6));
            project.setWebContent(rawFields.get(7));
            project.setBusiness(rawFields.get(8));
            project.setCountry(rawFields.get(9));
            project.setStatus(rawFields.get(10));
            project.setAmount1(parseDouble(rawFields.get(11)));
            project.setQuantity2(parseInteger(rawFields.get(12)));
            project.setAmount2(parseDouble(rawFields.get(13)));
            project.setFlag1("1".equals(rawFields.get(14)));
            project.setFlag2("1".equals(rawFields.get(15)));
            project.setFlag3("1".equals(rawFields.get(16)));
            project.setFlag4("1".equals(rawFields.get(17)));
            project.setAmount3(parseDouble(rawFields.get(18)));
            project.setAmount4(parseDouble(rawFields.get(19)));
            project.setQuantity3(parseInteger(rawFields.get(20)));
            project.setQuantity4(parseInteger(rawFields.get(21)));
            project.setAmount5(parseDouble(rawFields.get(22)));
            project.setFlag5("1".equals(rawFields.get(23)));
            project.setFlag6("1".equals(rawFields.get(24)));
            return project;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<String> processRawLine(String line) {
        return Stream.of(line.split("\\|"))
                .map(field -> field.substring(1, field.length() - 1))
                .collect(Collectors.toList());
    }
    
    private static Double parseDouble(String value) {
        try {
            return Double.valueOf(value);
        }catch (Exception e) {
            return null;
        }
    }

    private static Integer parseInteger(String value) {
        try {
            return Integer.valueOf(value);
        }catch (Exception e) {
            return null;
        }
    }
}
