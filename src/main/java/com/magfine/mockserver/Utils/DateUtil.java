package com.magfine.mockserver.Utils;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * 日期工具类
 *
 * @author Administrator
 */
public class DateUtil {

    public static final SimpleDateFormat SDF_YYYYMM = new SimpleDateFormat("yyyy-MM");
    public static final SimpleDateFormat SDF_YYYYMMDD1 = new SimpleDateFormat("yyyyMMdd");
    public static final SimpleDateFormat SDF_YYYYMMDD2 = new SimpleDateFormat("yyyy-MM-dd");
    public static final SimpleDateFormat SDF_YYYYMMDDHHMMSS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat SDF_YYYYMMDDHHMMSS2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static final SimpleDateFormat SDF_YYYYMMDDHHMMSSSSS = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    public static final SimpleDateFormat SDF_UTC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
    public static final SimpleDateFormat SDF_YYYYMMDDHHMMSS4 = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
    public static final SimpleDateFormat SDF_YYYY_MM = new SimpleDateFormat("yyyyMM");
    /**
     * yyyy-MM-dd HH:mm:ss
     */
    public static final String DATETIME_PATTERN = "[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}";
    /**
     * yyyy-MM-dd
     */
    public static final String DATE_PATTERN = "[0-9]{4}-[0-9]{2}-[0-9]{2}";

    /**
     * 获取系统当前时间
     */
    public static Date getSysNow() {
        return new Date(System.currentTimeMillis());
    }


    /**
     * 获取日期的年
     */
    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 获取日期的月
     */
    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH);
    }

    /**
     * 获取日期的日
     */
    public static int getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 获取日期
     */
    public static Date getDate(Object object) {
        if (object == null) {
            return null;
        }
        return (Date) object;
    }

    /**
     * 获得日期的对应其他日期（前后N年，前后N月，前后N日）
     *
     * @param date  标准日期
     * @param year  前后N年 0表示本年
     * @param month 前后N月 0表示本月
     * @param day   前后N日0表示本日
     */
    private static Date getSpecifiedDay(Date date, int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int thisYear = calendar.get(Calendar.YEAR);
        int thisMonth = calendar.get(Calendar.MONTH);
        int thisDay = calendar.get(Calendar.DATE);
        calendar.set(Calendar.YEAR, thisYear + year);
        calendar.set(Calendar.MONTH, thisMonth + month);
        calendar.set(Calendar.DATE, thisDay + day);
        return calendar.getTime();
    }

    /**
     * 获得今天的对应其他日期（前后N年，前后N月，前后N日）
     *
     * @param year  前后N年 0表示本年
     * @param month 前后N月 0表示本月
     * @param day   前后N日 0表示本日
     */
    public static Date getSpecifiedDay(int year, int month, int day) {
        Date date = new Date();
        return getSpecifiedDay(date, year, month, day);
    }

    /**
     * 日期转换成字符串
     */
    public static String dateToString(Date date) {
        if (date == null) {
            return null;
        }
        String format;
        format = SDF_YYYYMMDD2.format(date);
        return format;
    }


    public static String dateToString(Date date, SimpleDateFormat sdf) {
        if (date == null) {
            return null;
        }
        String format;
        format = sdf.format(date);
        return format;
    }

    /**
     * 字符串转换成日期(yyyy-MM-dd)
     */
    public static Date stringToDate(String string) {
        Date date = null;
        if (string == null || "".equals(string)) {
            return null;
        }
        try {
            date = SDF_YYYYMMDD2.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


    /**
     * 字符串转换成日期(yyyy-MM-dd HH:mm:ss)
     */
    public static Date stringToDateTime(String string) {
        Date date = null;
        if (string == null || "".equals(string)) {
            return null;
        }
        try {
            date = SDF_YYYYMMDDHHMMSS.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    
    /**
	 * 根据时间格式将字符串转换为(yyyy-MM-dd HH:mm:ss)或（yyyy-MM-dd），
	 * 仅支持(yyyy-MM-dd HH:mm:ss)，（yyyy-MM-dd）这两种格式
	 * @param dateStr
	 * @return
     * @throws ParseException 
	 */
	public static Date getDatetimeByFormat(String dateStr) throws ParseException{
		Date date = null;
		if(StringUtil.isBlank( dateStr )){
			dateStr=dateStr.trim();
			if(Pattern.compile(DATETIME_PATTERN).matcher(dateStr).matches()){
				date = SDF_YYYYMMDDHHMMSS.parse(dateStr);
			} else if(Pattern.compile(DATE_PATTERN).matcher(dateStr).matches()){
				date = SDF_YYYYMMDD2.parse(dateStr);
			} 
		}
		return date;
	}

    /**
     * 字符串转换成日期
     */
    public static Date stringToDateTimeByjindie(String string) {
        Date date = null;
        if (string == null || "".equals(string)) {
            return null;
        }
        try {
            date = SDF_YYYYMMDDHHMMSS4.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 字符串转换成日期
     */
    public static Date stringToDate(String string, SimpleDateFormat sdf) {
        Date date = null;
        try {
            date = sdf.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 整型转换成日期
     */
    private static Date intToDate(int year, int month) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        String thisTimeStr = String.valueOf(year);
        if (month >= 10) {
            thisTimeStr = thisTimeStr + "-" + month;
        } else {
            thisTimeStr = thisTimeStr + "-0" + month;
        }
        calendar.setTime(SDF_YYYYMM.parse(thisTimeStr));
        return calendar.getTime();
    }

    /**
     * 整形转换成日期字符串
     */
    public static String intToDateString(int year, int month) throws ParseException {
        return dateToString(intToDate(year, month));
    }

    /**
     * 日期比较大小
     */
    public static int dateCompare(Date date1, Date date2) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(date1);
        c2.setTime(date2);
        return c1.compareTo(c2);
    }

    /**
     * 字符串格式的日期，计算两日期相差的天数，闭区间[date1, date2]。
     */
    public static int daysBetween(String date1, String date2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(date1));
        long time1 = cal.getTimeInMillis();
        cal.setTime(sdf.parse(date2));
        long time2 = cal.getTimeInMillis();
        long betweenDays = (time2 - time1) / (24 * 60 * 60 * 1000) + 1;
        return Integer.parseInt(String.valueOf(betweenDays));
    }

    /**
     * 计算两个日期之间的分钟
     */
    private static int minutesBetween(Date date1, Date date2) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        long time1 = cal.getTimeInMillis();
        cal.setTime(date2);
        long time2 = cal.getTimeInMillis();
        long betweenMinutes = (time2 - time1) / (60 * 1000);
        return Integer.parseInt(String.valueOf(betweenMinutes));
    }

    /**
     * 计算两日期相差的小时数
     */
    private static int hoursBetween(Date date1, Date date2) {
        int hoursBetween = minutesBetween(date1, date2);
        return Integer.parseInt(String.valueOf(hoursBetween / 60));
    }

    /**
     * 字符串格式的日期，计算两日期相差的天数
     */
    public static int daysBetween(Date date1, Date date2) {
        int minutesBetween = hoursBetween(date1, date2);
        return Integer.parseInt(String.valueOf(minutesBetween / 24));
    }

    /**
     * 计算两个日期之间的月数
     */
    public static int monthBetween(Date date1, Date date2) {
        int daysBetween = daysBetween(date1, date2);
        return Integer.parseInt(String.valueOf(daysBetween / 30));
    }

    /**
     * 计算两个日期之间的月份数-只精确到月
     */
    public static int monthBetweenByMonth(Date date1, Date date2) {
        Calendar bef = Calendar.getInstance();
        Calendar aft = Calendar.getInstance();
        bef.setTime(date1);
        aft.setTime(date2);
        int result = aft.get(Calendar.MONTH) - bef.get(Calendar.MONTH);
        int month = (aft.get(Calendar.YEAR) - bef.get(Calendar.YEAR)) * 12;
        return Math.abs(month + result);
    }

    /**
     * 计算两个日期之间的年数
     */
    public static int yearsBetween(Date date1, Date date2) {
        int yearsBetween = monthBetween(date1, date2);
        return Integer.parseInt(String.valueOf(yearsBetween / 12));
    }


    /**
     * 传入的年和月是否在指定日期的N个月内
     */
    public static boolean inThisTime(int inMonth, Date date, int year, int month) throws ParseException {
        Calendar aft = Calendar.getInstance();
        Calendar bef = Calendar.getInstance();
        bef.setTime(intToDate(year, month));
        aft.setTime(date);
        int r = aft.get(Calendar.MONTH) - bef.get(Calendar.MONTH);
        int m = (aft.get(Calendar.YEAR) - bef.get(Calendar.YEAR)) * 12;
        return inMonth > Math.abs(m + r);
    }

    /**
     * 将long类型转化为Date
     */
    public static Date longToDare(long str) {
        return new Date(str * 1000);
    }
    
    /**
     * 毫秒数字符串和"yyyy-MM-dd HH:mm:ss"转Date
     * @param
     * @return
     */
    public static Date dateConvertor(String dateStr){
    	Date date = null;
    	try {
			if(Pattern.compile(DATETIME_PATTERN).matcher(dateStr).matches()){
				date = SDF_YYYYMMDDHHMMSS.parse(dateStr);
			} else {
				date = longToDare(Long.valueOf(dateStr));
			}
		} catch (NumberFormatException | ParseException e) {
			e.printStackTrace();
		}
        return date;
    }
    
    public static String uTCStringtODefaultString(String uTCString) {
        try {
            uTCString = uTCString.replace("Z", " UTC");
            Date date = SDF_UTC.parse(uTCString);
            String format;
            format = SDF_YYYYMMDDHHMMSS.format(date);
            return format;
        } catch (ParseException pe) {
            pe.printStackTrace();
            return null;
        }
    }

    /**
     * 获取当前日期的时间
     * +为后多少天
     * -为前多少天
     */
    public static Date getTimeByDay(Date date, int i) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, i);
        return c.getTime();
    }

    /**
     * 获取指定日期多少年
     * +为后多少年
     * -为前多少年
     */
    public static Date getTimeByYear(Date date, int num) {
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.YEAR, num);
            return calendar.getTime();
        } else {
            return null;
        }
    }

    /**
     * 获取指定日期多少月
     * +为后多少月
     * -为前多少月
     */
    public static Date getTimeByMonth(Date date, int num) {
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.MONTH, num);
            return calendar.getTime();
        } else {
            return null;
        }
    }


    /**
     * 获取指定时间的00：00:00, 23:59:59
     * 0是开始，1是结束
     */
    public static Date getStartOrEndTime(Date date, int type) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (type == 0) {
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
        }
        if (type == 1) {
            calendar.set(Calendar.HOUR_OF_DAY, 23);
            calendar.set(Calendar.MINUTE, 59);
            calendar.set(Calendar.SECOND, 59);
        }
        return calendar.getTime();
    }

    private static final String[] PATTERNS = {
            "yyyy-MM-dd HH:mm:ss",
            "yy-MM-dd HH:mm:ss",
            "yyyy/MM/dd HH:mm:ss",
            "yyyy-MM-dd",
            "yyyy-MM-dd'T'HH:mm:ss'.000Z'"
    };

    public static Instant trans(String value) {
        try {
            if (StringUtils.isBlank(value)) {
                return null;
            }
            return DateUtils.parseDate(value, PATTERNS).toInstant();
        } catch (ParseException e) {
            throw new RuntimeException("时间格式转换错误", e);
        }
    }

}
