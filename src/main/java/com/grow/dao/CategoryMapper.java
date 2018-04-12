package com.grow.dao;

import com.grow.pojo.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * FileName:CategoryMapper
 * Author:  ghw06
 * Date:    2018/4/10 22:27
 * Description: 构建ssm的第一个mapper接口
 */
@Repository
public interface CategoryMapper {
    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);

    List<Map<String, Object>> list();

    int count();
}
