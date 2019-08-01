package com.magfine.mockserver.Utils;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.BigInteger;

public class StringUtil {


    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isBlank(String str) {
        return str == null || str.trim().length() == 0;
    }


    /**
     * object转化为字符串，如果为空则返回null
     */
    public static String getString(Object object) {
        return object != null ? object.toString() : null;
    }

    /**
     * object转化为数字，如果为空则返回null
     */
    public static Integer getInteger(Object object) {
        if (object == null) {
            return null;
        }
        String str = String.valueOf(object);
        if (StringUtils.isBlank(str)) {
            return null;
        }
        return Integer.valueOf(object.toString());
    }

    /**
     * object转化为数字，如果为空则返回null
     */
    public static Long getLong(Object object) {
        if (object == null) {
            return null;
        }
        String str = String.valueOf(object);
        if (StringUtils.isBlank(str)) {
            return null;
        }
        return Long.valueOf(object.toString());
    }

    /**
     * object转化为Decimal，如果为空则返回null
     */
    public static BigDecimal getDecimal(Object object) {
        return transBigDecimal(object);
    }

    private static BigDecimal transBigDecimal(Object object)
    {
        BigDecimal bigDecimal = null;
        if (object != null && !"".equals(object)) {
            if (object instanceof BigDecimal) {
                bigDecimal = (BigDecimal) object;
            } else if (object instanceof String) {
                bigDecimal = new BigDecimal((String) object);
            } else if (object instanceof BigInteger) {
                bigDecimal = new BigDecimal((BigInteger) object);
            } else if (object instanceof Number) {
                bigDecimal = BigDecimal.valueOf(((Number) object).doubleValue());
            } else {
                System.out.println("数据异常：转化成浮点型失败");
            }
        }
        return bigDecimal;
    }

    /**
     * str转化为数字，如果为空则返回0
     */
    public static Integer getIntegerNullToZero(Object obj) {
        if (obj == null) {
            return 0;
        }
        String str = obj.toString();
        if (str == null || "".equals(str)) {
            return 0;
        }
        return Integer.valueOf(str);
    }

    public static BigDecimal getDecimalNullToZero(Object object) {
        BigDecimal bigDecimal = transBigDecimal(object);
        if (bigDecimal == null) {
            return BigDecimal.ZERO;
        }
        return bigDecimal;
    }

    public static String replaceEngBracketsToChineseBrackets(String str){
        if(str==null){
            return null;
        }
        return str.replaceAll("(\\()","（").replaceAll("(\\))","）");
    }

}
