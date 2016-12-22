package com.candy.utils;

/**
 * 字符串工具类
 *
 * Created by chenxiaoqiong on 2016/8/18 0018.
 */
public class StringUtils {

    /**
     * 字符串判空
     */
    public static boolean isNotNull(String str) {
        if (str != null && !"".equals(str) && !"null".equals(str)) {
            return true;
        }
        return false;
    }
    public static boolean isNull(String str) {
        if (str == null || "".equals(str)) {
            return true;
        }
        return false;
    }


    /**
     * 有一个为空就返回true
     * @param strArr
     * @return
     */
    public static boolean isOnlyNull(String... strArr) {
        for(String str:strArr){
            if (isNull(str)) {
                return true;
            }
        }

        return false;
    }

    /**
     * 有一个不为空就返回true
     * @param strArr
     * @return
     */
    public static boolean isOnlyNotNull(String... strArr) {
        for(String str:strArr) {
            if (isNotNull(str)) {
                return true;
            }
        }

        return false;
    }
}
