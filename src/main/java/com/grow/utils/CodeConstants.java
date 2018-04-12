package com.grow.utils;

/**
 * FileName:CodeConstants
 * Author:  ghw06
 * Date:    2018/4/11 10:03
 * Description: 公用常量
 */
public class CodeConstants {

    public final static int OPER_RESULT_VALUE = 0;
    public final static String OPER_RESULT_KEY = "code";
    public final static String OPER_DESC_KEY = "msg";
    public final static String OPER_DATA_KEY = "data";

    /**
     * 参数不能为空
     */
    public static int G_PAR_REQUIRED = 10000;

    /**
     * 参数无效
     */
    public static int G_PAR_INVALID = 10001;
    /**
     * 参数格式无效
     */
    public static int G_PAR_FORMAT_INVALID = 10002;
    /**
     * 请求超时
     */
    public static int G_REQ_TIME_OUT = 10003;
    /**
     * 请求校验失败
     */
    public static int G_REQ_AUTHEN_FAIL = 10004;
    /**
     * 帐号/密码错误
     */
    public static int G_ACCOUNT_PASSWORD_INVALID = 10005;
    /**
     * 验证/手机号码未填写
     */
    public static int G_VERIFY_PHONE_INVALID = 10006;
    /**
     * 非唯一值
     */
    public static int G_VERIFY_NONUNIQUE = 10007;
    /**
     * 权限不足
     */
    public static int G_AUTHOR_REQUIRED = 10008;
    /**
     * 未登录/会话超时
     */
    public static int G_AUTHEN_REQUIRED = -10009;
    /**
     * 非法请求请求
     */
    public static int G_CSRF_TOKEN_INVALID = 10010;
    /**
     * 帐号重复
     */
    public static int USR_USER_NAME_NONUNIQUE = 10011;
    /**
     * 旧密码错误
     */
    public static int USR_OLD_PASSWORD_ERROR = 10012;
    /**
     * 未认证
     */
    public static int G_VERIFY_CODE_INVALID = 10013;
    /**
     * 未知错误
     */
    public static int G_UNKNOW = 99999;
}
