package net.gongmingqm10.exporter.util;

import net.gongmingqm10.exporter.model.Backing;
import net.gongmingqm10.exporter.model.Project;
import net.gongmingqm10.exporter.model.Series;
import net.gongmingqm10.exporter.model.Traffic;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parser {

    public static Backing transformRawBacking(String rawBacking) {
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

    public static Series transformRawSeries(String rawSeries) {
        try {
            if (StringUtils.isEmpty(rawSeries)) {
                return null;
            }
            List<String> rawFields = processRawLine(rawSeries);
            if (rawFields.size() != 12) {
                return null;
            }
            Series series = new Series();
            series.setCode1(rawFields.get(0));
            series.setLaunchedAt(parseDate(rawFields.get(1)));
            series.setQuantity1(parseInteger(rawFields.get(2)));
            series.setAmount1(parseDouble(rawFields.get(3)));
            series.setQuantity1(parseInteger(rawFields.get(4)));
            series.setQuantity2(parseInteger(rawFields.get(5)));
            series.setQuantity3(parseInteger(rawFields.get(6)));
            series.setQuantity4(parseInteger(rawFields.get(7)));
            series.setQuantity5(parseInteger(rawFields.get(8)));
            series.setQuantity6(parseInteger(rawFields.get(9)));
            series.setQuantity7(parseInteger(rawFields.get(10)));
            series.setQuantity8(parseInteger(rawFields.get(11)));
            return series;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Date parseDate(String rawDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(rawDate);
    }

    public static Project transformRawProject(String rawProject) {
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

    public static Traffic transformRawTraffic(String rawTraffic) {
        try {
            if (StringUtils.isEmpty(rawTraffic)) {
                return null;
            }
            List<String> rawFields = processRawLine(rawTraffic);
            if (rawFields.size() != 37) {
                return null;
            }
            Traffic traffic = new Traffic();
            traffic.setCode1(rawFields.get(0));
            traffic.setLaunchedAt(parseDate(rawFields.get(1)));
            traffic.setAmount1(parseDouble(rawFields.get(2)));
            traffic.setAmount2(parseDouble(rawFields.get(3)));
            traffic.setAmount3(parseDouble(rawFields.get(4)));
            traffic.setAmount4(parseDouble(rawFields.get(5)));
            traffic.setAmount5(parseDouble(rawFields.get(6)));
            traffic.setAmount6(parseDouble(rawFields.get(7)));
            traffic.setAmount7(parseDouble(rawFields.get(8)));
            traffic.setAmount8(parseDouble(rawFields.get(9)));
            traffic.setAmount9(parseDouble(rawFields.get(10)));
            traffic.setAmount10(parseDouble(rawFields.get(11)));
            traffic.setAmount11(parseDouble(rawFields.get(12)));
            traffic.setAmount12(parseDouble(rawFields.get(13)));
            traffic.setAmount13(parseDouble(rawFields.get(14)));
            traffic.setAmount14(parseDouble(rawFields.get(15)));
            traffic.setAmount15(parseDouble(rawFields.get(16)));
            traffic.setAmount16(parseDouble(rawFields.get(17)));
            traffic.setAmount17(parseDouble(rawFields.get(18)));
            traffic.setAmount18(parseDouble(rawFields.get(19)));
            traffic.setAmount19(parseDouble(rawFields.get(20)));
            traffic.setAmount20(parseDouble(rawFields.get(21)));
            traffic.setAmount21(parseDouble(rawFields.get(22)));
            traffic.setAmount22(parseDouble(rawFields.get(23)));
            traffic.setAmount23(parseDouble(rawFields.get(24)));
            traffic.setAmount24(parseDouble(rawFields.get(25)));
            traffic.setAmount25(parseDouble(rawFields.get(26)));
            traffic.setAmount26(parseDouble(rawFields.get(27)));
            traffic.setAmount27(parseDouble(rawFields.get(28)));
            traffic.setAmount28(parseDouble(rawFields.get(29)));
            traffic.setAmount29(parseDouble(rawFields.get(30)));
            traffic.setAmount30(parseDouble(rawFields.get(31)));
            traffic.setAmount31(parseDouble(rawFields.get(32)));
            traffic.setAmount32(parseDouble(rawFields.get(33)));
            traffic.setAmount33(parseDouble(rawFields.get(34)));
            traffic.setAmount34(parseDouble(rawFields.get(35)));
            traffic.setAmount35(parseDouble(rawFields.get(36)));
            return traffic;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
