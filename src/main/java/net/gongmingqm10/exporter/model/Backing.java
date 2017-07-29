package net.gongmingqm10.exporter.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;


@DatabaseTable(tableName = "backing")
public class Backing {
    @DatabaseField(generatedId = true, columnName = "ID")
    private Long id;

    @DatabaseField(columnName = "code1")
    private String code1;

    @DatabaseField(columnName = "code2")
    private String code2;

    @DatabaseField(columnName = "launched_at")
    private Date launchedAt;

    @DatabaseField(columnName = "status")
    private String status;

    @DatabaseField(columnName = "money")
    private Double money;

    public Backing() {
    }

    public Backing(String code1, String code2, Date launchedAt, String status, Double money) {
        this.code1 = code1;
        this.code2 = code2;
        this.launchedAt = launchedAt;
        this.status = status;
        this.money = money;
    }

    public String getCode1() {
        return code1;
    }

    public String getCode2() {
        return code2;
    }

    public Date getLaunchedAt() {
        return launchedAt;
    }

    public String getStatus() {
        return status;
    }

    public Double getMoney() {
        return money;
    }
}

