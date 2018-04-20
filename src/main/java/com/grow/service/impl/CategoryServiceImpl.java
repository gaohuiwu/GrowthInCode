package com.grow.service.impl;

import com.grow.dao.CategoryMapper;
import com.grow.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * FileName:CategoryServiceImpl
 * Author:  ghw06
 * Date:    2018/4/10 22:30
 * Description: 实现业务层接口
 */
@Service
@CacheConfig(cacheNames = "sysCategory")
public class CategoryServiceImpl implements CategoryService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    @Cacheable
    public List<Map<String, Object>> list() {
        for (Map<String, Object> map : categoryMapper.list()) {
            logger.info("查询结果：" + map.get("name"));
        }
        return categoryMapper.list();
    }
}
