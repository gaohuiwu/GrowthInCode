package com.grow.utils;

import java.nio.charset.Charset;

/**
 * @Auther: ghw06
 * @Date: 2019/1/24
 * @Description:
 */
public interface Constant {
    String API_OPER_RESULT_KEY = "operResult";
    String API_OPER_DESC_KEY = "desc";
    String API_OPER_DATA_KEY = "data";
    String API_ERROR_CODE_KEY = "errorCode";
    String API_ERROR_MSG_KEY = "errorMsg";
    String CHARSET_NAME = "utf-8";
    Charset CHARSET = Charset.forName("utf-8");
    String SQL_PAGE_KEY = "Page.class";
    String SQL_ORDER_BY_KEY = "orderBy";
    String SYS_ENT_ID = "0";
    String SYS_MENU_ROOT_ID = "0";
    String SYS_ROLE_ROOT_ID = "0";
    String SYS_ROLE_GROUP_DEFAULT_ID = "1";
}
