package com.grow.utils;

import com.sun.xml.internal.bind.v2.TODO;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.text.MessageFormat;

/**
 * FileName:StringExUtil
 * Author:  ghw06
 * Date:    2018/4/11 10:09
 * Description: 字符串工具类方法扩展
 */
// TODO: 2018/4/11 是否鸡肋?
public class StringExUtil extends StringUtils {


    public final static String DEFAULT_SPLITER = ",";
    private final static String NUM_ZERO = "0";

    /**
     * 字符串首字母小写
     *
     * @param str
     * @return
     */
    public static String toLowerCaseFirstOne(String str) {
        if (str == null || "".equals(str))
            return str;
        if (Character.isLowerCase(str.charAt(0)))
            return str;
        else
            return (new StringBuilder()).append(Character.toLowerCase(str.charAt(0))).append(str.substring(1))
                    .toString();
    }

    /**
     * 字符串首字母大写
     *
     * @param str
     * @return
     */
    public static String toUpperCaseFirstOne(String str) {
        if (str == null || "".equals(str))
            return str;
        if (Character.isUpperCase(str.charAt(0)))
            return str;
        else
            return (new StringBuilder()).append(Character.toUpperCase(str.charAt(0))).append(str.substring(1))
                    .toString();
    }

    /**
     * 格式化输出
     *
     * @param msg
     * @param args
     * @return
     */
    public static String formatMessage(String msg, Object... args) {
        if (isBlank(msg) || ArrayUtils.getLength(args) == 0) {
            return msg;
        } else {
            return MessageFormat.format(msg, args);
        }
    }

    /**
     * 将字符串数组trim后拼接成字符串，用默认的分隔符进行分隔
     *
     * @param strArr
     * @return
     */
    public static String StrArrToString(String[] strArr) {
        AssertUtil.argIsNull(strArr, "参数strArr为null");
        return StrArrToString(strArr, DEFAULT_SPLITER);
    }

    /**
     * 将数组trim后拼接成字符串,用指定的分隔符进行分隔
     *
     * @param strArr
     * @return
     */
    public static String StrArrToString(String[] strArr, String spliter) {
        AssertUtil.argIsNull(strArr, "参数strArr为null");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i].trim());
            if (i < strArr.length - 1) {
                sb.append(spliter);
            }
        }
        return sb.toString();
    }

    /**
     * 为字符串进行前补零
     *
     * @param length 总长度
     * @param str    原字符串
     * @return
     */
    public static String fullWithZero(int length, String str) {
        return leftPad(str, length, NUM_ZERO);
        //return String.format("%0" + length + "d", Integer.parseInt(str) + 1);
    }

    /**
     * 为字符串进行后补零
     *
     * @param length 总长度
     * @param str    原字符串
     * @return
     */
    public static String fullWithZeroBefore(int length, String str) {
        return rightPad(str, length, NUM_ZERO);
    }
}
