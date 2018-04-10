package com.grow.controller;

import com.grow.pojo.Category;
import com.grow.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * FileName:CategoryController
 * Author:  ghw06
 * Date:    2018/4/10 22:33
 * Description: 构建ssm的第一个控制层
 */
@Controller
@RequestMapping("/example")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/list")
    public ModelAndView listCategory() {
        ModelAndView mv = new ModelAndView();
        List<Category> cs = categoryService.list();

        // 放入转发参数
        mv.addObject("cs", cs);
        // 放入jsp路径
        mv.setViewName("listCategory");
        return mv;
    }

}
