package com.grow.pojo;

/**
 * FileName:Category
 * Author:  ghw06
 * Date:    2018/4/10 22:26
 * Description: 构建ssm的第一个实体类
 */
public class Category {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + "]";
    }
}
