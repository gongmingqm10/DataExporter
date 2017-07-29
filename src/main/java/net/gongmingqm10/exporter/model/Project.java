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
@DatabaseTable(tableName = "project")
public class Project {
    @DatabaseField(generatedId = true, columnName = "ID")
    private Long id;

    @DatabaseField(columnName = "code1")
    private String code1;

    @DatabaseField(columnName = "code2")
    private String code2;

    @DatabaseField(columnName = "launch_from")
    private Date launchFrom;

    @DatabaseField(columnName = "launch_to")
    private Date launchTo;

    @DatabaseField(columnName = "quantity1")
    private Integer quantity1;

    @DatabaseField(columnName = "title")
    private String title;

    @DatabaseField(columnName = "short_title")
    private String shortTitle;

    @DatabaseField(columnName = "web_content")
    private String webContent;

    @DatabaseField(columnName = "business")
    private String business;

    @DatabaseField(columnName = "country")
    private String country;

    @DatabaseField(columnName = "status")
    private String status;

    @DatabaseField(columnName = "amount1")
    private Double amount1;

    @DatabaseField(columnName = "quantity2")
    private Integer quantity2;

    @DatabaseField(columnName = "amount2")
    private Double amount2;

    @DatabaseField(columnName = "flag1")
    private boolean flag1;

    @DatabaseField(columnName = "flag2")
    private boolean flag2;

    @DatabaseField(columnName = "flag3")
    private boolean flag3;

    @DatabaseField(columnName = "flag4")
    private boolean flag4;

    @DatabaseField(columnName = "amount3")
    private Double amount3;

    @DatabaseField(columnName = "amount4")
    private Double amount4;

    @DatabaseField(columnName = "quantity3")
    private Integer quantity3;

    @DatabaseField(columnName = "quantity4")
    private Integer quantity4;

    @DatabaseField(columnName = "amount5")
    private Double amount5;

    @DatabaseField(columnName = "flag5")
    private boolean flag5;

    @DatabaseField(columnName = "flag6")
    private boolean flag6;
}
