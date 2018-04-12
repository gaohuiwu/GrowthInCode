package com.grow.utils;

import java.util.Random;
import java.util.UUID;

/**
 * 创建id的工具类
 */
public class CreateIdUtil {

    /* 生成8位随机数 */
    public static Integer get8ID() {
        int count = 0;
        char str[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while (count < 8) {
            int i = Math.abs(r.nextInt(10));
            if (i >= 0 && i < str.length) {
                pwd.append(str[i]);
                count++;
            }
        }
        return Integer.parseInt(pwd.toString());
    }

    /* 生成10位随机数 */
    public static String get10ID() {
        int count = 0;
        char str[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while (count < 10) {
            int i = Math.abs(r.nextInt(10));
            if (i >= 0 && i < str.length) {
                pwd.append(str[i]);
                count++;
            }
        }
        return pwd.toString();
    }

    public static String get32UUID() {
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }

}
