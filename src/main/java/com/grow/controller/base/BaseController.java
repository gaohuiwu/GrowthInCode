package com.grow.controller.base;

import com.grow.utils.CodeConstants;
import com.grow.utils.CreateIdUtil;
import com.grow.utils.PageData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * FileName:BaseController
 * Author:  ghw06
 * Date:    2018/4/12 11:45
 * Description: 通用控制层
 */
public class BaseController {

    /*这边要增加日志控制输出*/

    /**
     * 得到PageData
     */
    public PageData getPageData() {
        return new PageData(this.getRequest());
    }

    public Map<String, Object> getOperResultMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(CodeConstants.OPER_RESULT_KEY, CodeConstants.OPER_RESULT_VALUE);
        return map;
    }

    public Map<String, Object> getOperResultMap(Object obj) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(CodeConstants.OPER_RESULT_KEY, CodeConstants.OPER_RESULT_VALUE);
        map.put(CodeConstants.OPER_DATA_KEY, obj);
        return map;
    }

    public Map<String, Object> getOperResultMap(String msg) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(CodeConstants.OPER_RESULT_KEY, CodeConstants.OPER_RESULT_VALUE);
        map.put(CodeConstants.OPER_DESC_KEY, msg);
        return map;
    }

    public Map<String, Object> getOperResultMap(String msg, Object obj) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(CodeConstants.OPER_RESULT_KEY, CodeConstants.OPER_RESULT_VALUE);
        map.put(CodeConstants.OPER_DESC_KEY, msg);
        map.put(CodeConstants.OPER_DATA_KEY, obj);
        return map;
    }

    public Map<String, Object> getFaildResultMap(String msg, Object obj) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(CodeConstants.OPER_RESULT_KEY, -1);
        map.put(CodeConstants.OPER_DESC_KEY, msg);
        map.put(CodeConstants.OPER_DATA_KEY, obj);
        return map;
    }

    /*public Map<String, Object> getOperResultMap(int result, String msg, Object obj) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(CodeConstants.OPER_RESULT_KEY, result);
        map.put(CodeConstants.OPER_DESC_KEY, msg);
        map.put(CodeConstants.OPER_DATA_KEY, obj);
        return map;
    }*/
    /**
     * 得到ModelAndView
     */
    public ModelAndView getModelAndView() {
        return new ModelAndView();
    }

    /**
     * 得到request对象
     */
    public HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();

        return request;
    }

   /* public String getContextPath() {
        return Const.CONTEXT_PATH;
    }*/

    /**
     * 得到32位的uuid
     *
     * @return
     */
    public String get32UUID() {

        return CreateIdUtil.get32UUID();
    }

    public String getIpAddress() {
        HttpServletRequest request = getRequest();
        String ip = request.getHeader("X-Forwarded-For");
        if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
            // 多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = ip.indexOf(",");
            if (index != -1) {
                return ip.substring(0, index);
            } else {
                return ip;
            }
        }
        ip = request.getHeader("X-Real-IP");
        if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
            return ip;
        }
        ip = request.getHeader("Proxy-Client-IP");
        if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
            return ip;
        }
        ip = request.getHeader("WL-Proxy-Client-IP");
        if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
            return ip;
        }
        return request.getRemoteAddr();

    }

    /*public static void logBefore(Logger logger, String interfaceName) {
        logger.info("");
        logger.info("start");
        logger.info(interfaceName);
    }

    public static void logAfter(Logger logger) {
        logger.info("end");
        logger.info("");
    }*/
}
