package net.gongmingqm10.exporter.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "visit")
public class Visit {
    @DatabaseField(generatedId = true, columnName = "ID")
    private Long id;

    @DatabaseField(columnName = "file_name")
    private String fileName;

    public Visit() {}

    public Visit(String fileName) {
        this.fileName = fileName;
    }
}
