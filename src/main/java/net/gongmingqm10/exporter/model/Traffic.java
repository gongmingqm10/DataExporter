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
@DatabaseTable(tableName = "traffic")
public class Traffic {
    @DatabaseField(generatedId = true, columnName = "ID")
    private Long id;

    @DatabaseField(columnName = "code1")
    private String code1;
    @DatabaseField(columnName = "launched_at")
    private Date launchedAt;
    @DatabaseField(columnName = "amount1")
    private Double amount1;
    @DatabaseField(columnName = "amount2")
    private Double amount2;
    @DatabaseField(columnName = "amount3")
    private Double amount3;
    @DatabaseField(columnName = "amount4")
    private Double amount4;
    @DatabaseField(columnName = "amount5")
    private Double amount5;
    @DatabaseField(columnName = "amount6")
    private Double amount6;
    @DatabaseField(columnName = "amount7")
    private Double amount7;
    @DatabaseField(columnName = "amount8")
    private Double amount8;
    @DatabaseField(columnName = "amount9")
    private Double amount9;
    @DatabaseField(columnName = "amount10")
    private Double amount10;
    @DatabaseField(columnName = "amount11")
    private Double amount11;
    @DatabaseField(columnName = "amount12")
    private Double amount12;
    @DatabaseField(columnName = "amount13")
    private Double amount13;
    @DatabaseField(columnName = "amount14")
    private Double amount14;
    @DatabaseField(columnName = "amount15")
    private Double amount15;
    @DatabaseField(columnName = "amount16")
    private Double amount16;
    @DatabaseField(columnName = "amount17")
    private Double amount17;
    @DatabaseField(columnName = "amount18")
    private Double amount18;
    @DatabaseField(columnName = "amount19")
    private Double amount19;
    @DatabaseField(columnName = "amount20")
    private Double amount20;
    @DatabaseField(columnName = "amount21")
    private Double amount21;
    @DatabaseField(columnName = "amount22")
    private Double amount22;
    @DatabaseField(columnName = "amount23")
    private Double amount23;
    @DatabaseField(columnName = "amount24")
    private Double amount24;
    @DatabaseField(columnName = "amount25")
    private Double amount25;
    @DatabaseField(columnName = "amount26")
    private Double amount26;
    @DatabaseField(columnName = "amount27")
    private Double amount27;
    @DatabaseField(columnName = "amount28")
    private Double amount28;
    @DatabaseField(columnName = "amount29")
    private Double amount29;
    @DatabaseField(columnName = "amount30")
    private Double amount30;
    @DatabaseField(columnName = "amount31")
    private Double amount31;
    @DatabaseField(columnName = "amount32")
    private Double amount32;
    @DatabaseField(columnName = "amount33")
    private Double amount33;
    @DatabaseField(columnName = "amount34")
    private Double amount34;
    @DatabaseField(columnName = "amount35")
    private Double amount35;
}
