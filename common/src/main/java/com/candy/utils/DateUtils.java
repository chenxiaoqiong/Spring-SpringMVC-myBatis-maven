package com.candy.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具类
 * Created by chenxiaoqiong on 2016/10/20 0020 下午 3:13.
 */
public class DateUtils {
    private static final SimpleDateFormat formatExactForMonth = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * yyyy-MM-dd HH:mm
     * @param date
     * @return
     */
    public static Date getDateExactForMonth(String date){
        try {
            return formatExactForMonth.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取当前时间（精确到天）
     * @param date
     * @return yyyy-MM-dd
     */
    public static String getDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        return formatter.format(date);
    }

    /**
     * /获取当前月第一天
     * @return yyyy-MM-dd
     */
    public static String getFirstDayOfMon(Date date){
        Calendar c = Calendar.getInstance();
        if(date != null){
            c.setTime(date);
        }
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        String first = format.format(c.getTime());
        return first;
    }

    /**
     * 获取当前月的最后一天
     * @return yyyy-MM-dd
     */
    public static String getLastDayOfMon(Date date) {
        Calendar ca = Calendar.getInstance();
        if(date != null){
            ca.setTime(date);
        }
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        String last = format.format(ca.getTime());
        return last;
    }

}
