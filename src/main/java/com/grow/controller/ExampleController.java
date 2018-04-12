package com.grow.controller;

import com.github.pagehelper.PageHelper;
import com.grow.controller.base.BaseController;
import com.grow.page.PageInfo;
import com.grow.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * FileName:ExampleController
 * Author:  ghw06
 * Date:    2018/4/12 11:20
 * Description: 测试控制层
 */
@Controller
@RequestMapping("example")
public class ExampleController extends BaseController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "examplePage")
    public ModelAndView examplePage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/example/examplePage.vm");
        return mv;
    }

    @RequestMapping(value = "examplePage", method = RequestMethod.POST)
    @ResponseBody
    public Object examplePage(int page, int rows, String batchDesc) {

        PageHelper.startPage(page, rows);
        List<Map<String, Object>> data = categoryService.list();
        PageInfo<Map<String, Object>> pg = new PageInfo<>(data);
        return this.getOperResultMap("操作成功", pg);
    }
}
