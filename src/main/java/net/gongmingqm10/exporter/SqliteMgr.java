package net.gongmingqm10.exporter;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import net.gongmingqm10.exporter.model.*;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqliteMgr {
    private static final String DB_URL = "jdbc:sqlite:science.db";
    private static SqliteMgr instance;
    private Dao<Backing, Long> backingDao;
    private Dao<Project, Long> projectDao;
    private Dao<Series, Long> seriesDao;
    private Dao<Traffic, Long> trafficDao;
    private Dao<Visit, Long> visitDao;
    private ConnectionSource connectionSource;

    private SqliteMgr() {
        try {
            connectionSource = new JdbcConnectionSource(DB_URL);
            backingDao = DaoManager.createDao(connectionSource, Backing.class);
            projectDao = DaoManager.createDao(connectionSource, Project.class);
            visitDao = DaoManager.createDao(connectionSource, Visit.class);
            seriesDao = DaoManager.createDao(connectionSource, Series.class);
            trafficDao = DaoManager.createDao(connectionSource, Traffic.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static SqliteMgr getInstance() {
        if (instance == null) {
            instance = new SqliteMgr();
        }
        return instance;
    }

    public void close() {
        try {
            if (connectionSource != null) {
                connectionSource.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isFileVisited(String fileName) {
        try {
            Map<String, Object> whereClause = new HashMap<>();
            whereClause.put("file_name", fileName);
            List<Visit> visits = visitDao.queryForFieldValuesArgs(whereClause);
            return visits != null && visits.size() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void createVisit(Visit visit) throws SQLException {
        visitDao.create(visit);
    }

    public void createBacking(List<Backing> backing) throws SQLException {
        backingDao.create(backing);
    }

    public void createProject(List<Project> project) throws SQLException {
        projectDao.create(project);
    }

    public void createSeries(List<Series> series) throws SQLException {
        seriesDao.create(series);
    }

    public void createTraffic(List<Traffic> traffic) throws SQLException {
        trafficDao.create(traffic);
    }

}
