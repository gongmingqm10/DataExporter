package net.gongmingqm10.exporter.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DatabaseTable(tableName = "series")
public class Series {
    @DatabaseField(generatedId = true, columnName = "ID")
    private Long id;

    @DatabaseField(columnName = "code1")
    private String code1;

    @DatabaseField(columnName = "launched_at")
    private Date launchedAt;

    @DatabaseField(columnName = "quantity1")
    private Integer quantity1;

    @DatabaseField(columnName = "amount1")
    private Double amount1;

    @DatabaseField(columnName = "quantity2")
    private Integer quantity2;

    @DatabaseField(columnName = "quantity3")
    private Integer quantity3;

    @DatabaseField(columnName = "quantity4")
    private Integer quantity4;

    @DatabaseField(columnName = "quantity5")
    private Integer quantity5;

    @DatabaseField(columnName = "quantity6")
    private Integer quantity6;

    @DatabaseField(columnName = "quantity7")
    private Integer quantity7;

    @DatabaseField(columnName = "quantity8")
    private Integer quantity8;
}
