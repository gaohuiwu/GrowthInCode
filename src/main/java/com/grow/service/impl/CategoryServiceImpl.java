package com.grow.service.impl;

import com.grow.dao.CategoryMapper;
import com.grow.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Map<String, Object>> list() {
        return categoryMapper.list();
    }
}
