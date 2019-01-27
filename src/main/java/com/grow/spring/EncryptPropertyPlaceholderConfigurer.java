package com.grow.spring;

import com.grow.utils.AESUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * @Auther: ghw06
 * @Date: 2019/1/24
 * @Description: 注入properties配置文件的bean
 */
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /*用aes加密*/
    private static final String PREFIX = "aes:";
    private static final String PASSWORD = "com.gaohw";

    public EncryptPropertyPlaceholderConfigurer() {
    }

    protected String convertProperty(String propertyName, String propertyValue) {
        if (StringUtils.startsWithIgnoreCase(propertyValue, PREFIX)) {
            try {
                return AESUtil.decryptHex(propertyValue.substring(PREFIX.length()), PASSWORD);
            } catch (Exception e) {
                this.logger.debug("properties decrypt occurred failure", e);
            }
        }
        return super.convertProperty(propertyName, propertyValue);
    }
}
