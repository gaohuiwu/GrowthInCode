package com.grow.controller.zwj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: ghw06
 * @Date: 2019/1/21
 * @Description:
 */
@Controller
@RequestMapping("sister")
public class SisterController {

    @RequestMapping(value = "welcome")
    public ModelAndView welcome(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("zwj/welcome.vm");
        return mv;
    }


    @RequestMapping(value = "start")
    public ModelAndView start(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("zwj/sidebar.vm");
        return mv;
    }
}
