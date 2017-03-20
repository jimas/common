package com.jimas.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;


public class DateUtil {
    public static final String DATE_FORMAT = "yyyy-MM-dd";

    public static final String TIME_FORMAT = "HH:mm:ss";

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    
    public static final String DATE_MINUTE_FORMAT = "yyyy-MM-dd HH:mm";

    public static final String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss.S";
    
    public static final String TIMESTAMP_ALL_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    public static final String SHORT_MONTH_FORMAT = "yyyyMM";

    public static final String SHORT_DATE_FORMAT = "yyyyMMdd";
    
    private DateUtil() {
    };
    
    /**
     * 日期转字符串，输出格式 "yyyy-MM-dd"
     * 
     * @param date
     * @return
     */
    public static String formatDate(Date date) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
            return formatter.format(date);
        } catch (Exception e) {
            return null;
        }
    }
    public static String format(Date date,String format){
        try {
            if (format != null && !"".equals(format) && date != null) {
                SimpleDateFormat formatter = new SimpleDateFormat(format);
                return formatter.format(date);
            }
        } catch (Exception e) {
            return "";
        }
        return "";
    }
    
    /**
     * 智能匹配日期格式 格式： yyyy-MM-dd HH:mm:ss yyyy-MM-dd HH:mm:ss.S HH:mm:ss yyyy-MM-dd yyyyMM yyyyMMdd
     * 
     * @param str
     * @return
     * @throws Exception
     */
    public static Date parseStrAutoToDate(String str) {
        DateFormat df = null;
        if (str == null) {
            return null;
        }
        String s = str.replaceAll("/", "-");
        Date d = null;

        if (s.contains(":")) {
            if (s.length() == DATE_TIME_FORMAT.length())
                df = new SimpleDateFormat(DATE_TIME_FORMAT);
            else if (s.length() == TIME_FORMAT.length())
                df = new SimpleDateFormat(TIME_FORMAT);
            else if (s.length() == TIMESTAMP_FORMAT.length())
                df = new SimpleDateFormat(TIMESTAMP_FORMAT);
            else if (s.length() == TIMESTAMP_ALL_FORMAT.length())
                df = new SimpleDateFormat(TIMESTAMP_ALL_FORMAT);
            else if(s.length()==DATE_MINUTE_FORMAT.length())
                df=new SimpleDateFormat(DATE_MINUTE_FORMAT);
        } else if (s.contains("-")) {
            if (s.length() == DATE_FORMAT.length()) {
                df = new SimpleDateFormat(DATE_FORMAT);
            }
        } else {
            if (s.length() == SHORT_DATE_FORMAT.length())
                df = new SimpleDateFormat(SHORT_DATE_FORMAT);
            else if (s.length() == SHORT_MONTH_FORMAT.length())
                df = new SimpleDateFormat(SHORT_MONTH_FORMAT);
            else
                df = new SimpleDateFormat(DATE_FORMAT); // 默认值
        }
        try {
            d = df.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }
    /**
     * 功能：获取起始日期和终止日期之间的日期(包含起始和终止日期)
     * 
     * @param startDate
     * @param endDate
     * @return
     */
    public static Set<String> getDayList(Date startDate, Date endDate) {
        long begin = startDate.getTime();
        long end = endDate.getTime();
        long inter = end - begin;
        if (inter < 0) {
            inter = inter * (-1);
        }
        long dateMillSec = 86400000;
        long dateCnt = inter / dateMillSec;
        Set<String> set = new LinkedHashSet<String>();
        Calendar cl = Calendar.getInstance();
        cl.setTime(startDate);
        cl.set(Calendar.HOUR_OF_DAY, 0);
        cl.set(Calendar.MINUTE, 0);
        cl.set(Calendar.SECOND, 0);
        cl.set(Calendar.MILLISECOND, 0);
        set.add(getDateFormat(cl.getTime()));
        for (int i = 1; i <= dateCnt; i++) {
            cl.add(Calendar.DAY_OF_YEAR, 1);
            set.add(getDateFormat(cl.getTime()));
        }
        set.add(getDateFormat(endDate));
        return set;
    }
    
    /**
     * 功能：获取yyyyMMdd的年月日
     * 
     * @param date
     * @return
     */
    private static String getShortDate(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(SHORT_DATE_FORMAT);
        return df.format(date);
    }

    /**
     * 功能：获取yyyyMM的年月
     * 
     * @param date
     * @return
     */
    public static String getShortMonth(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(SHORT_MONTH_FORMAT);
        return df.format(date);
    }
    /**
     * 功能：获取yyyy-MM-dd的年月日
     * 
     * @param date
     * @return
     */
    public static String getDateFormat(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(DATE_FORMAT);
        return df.format(date);
    }

    /* 
     * 将时间转换为时间戳
     */    
    public static String dateToStamp(String dateStr){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);
        Date date;
        try {
            date = simpleDateFormat.parse(dateStr);
            long ts = date.getTime();
            return   String.valueOf(ts);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }
    
    /* 
     * 将时间戳转换为时间
     */
    public static String stampToDate(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
}
