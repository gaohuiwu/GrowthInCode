package com.grow.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * 用于传入参数检查.
 * 断言
 */
public class AssertUtil {
    /**
     * 验证方法传入的参数是否为null，如果是则抛非法参数异常，异常信息可以自己指定
     *
     * @param o
     * @param msg
     */
    public static void argIsNull(Object o, String msg) {
        if (o == null) {
            if (StringUtils.isBlank(msg)) {
                msg = "参数为null";
            }
            throw new RuntimeException(msg);
        }
    }

    /**
     * 验证字符串是否为null或空，如果是则抛如果是则抛非法参数异常，异常信息可以自己指定
     *
     * @param str
     */
    public static void argIsBlank(String str, String msg) {
        if (StringUtils.isBlank(str)) {
            if (StringUtils.isBlank(msg)) {
                msg = "字符串为空: " + str;
            }
            throw new RuntimeException(msg);
        }
    }

    /**
     * 对象如果是null则抛运行时异常，异常信息可以自己指定
     *
     * @param o
     * @param msg
     */
    public static void objIsNull(Object o, String msg) {
        if (o == null) {
            if (StringUtils.isBlank(msg)) {
                msg = "对象为null";
            }
            throw new RuntimeException(msg);
        }
    }

    /**
     * 对象如果不是null则抛运行时异常，异常信息可以自己指定
     *
     * @param o
     * @param msg
     */
    public static void objIsNoNull(Object o, String msg) {
        if (o != null) {
            if (StringUtils.isBlank(msg)) {
                msg = "对象不为null";
            }
            throw new RuntimeException(msg);
        }
    }

    /**
     * 验证对象是否为null，如果是null，则抛运行时异常，异常信息可以自己指定
     *
     * @param str
     * @param msg
     */
    public static void strIsBlank(String str, String msg) {
        if (StringUtils.isBlank(str)) {
            if (StringUtils.isBlank(msg)) {
                msg = "字符串为空: " + str;
            }
            throw new RuntimeException(msg);
        }
    }
}
