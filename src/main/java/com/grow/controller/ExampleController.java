package com.grow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * FileName:ExampleController
 * Author:  ghw06
 * Date:    2018/4/12 11:20
 * Description: 测试控制层
 */
@Controller
@RequestMapping("example")
public class ExampleController {

    @RequestMapping(value = "examplePage")
    public ModelAndView examplePage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/example/examplePage.vm");
        return mv;
    }
}
