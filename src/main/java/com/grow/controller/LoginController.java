package com.grow.controller;

import com.grow.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * FileName:LoginController
 * Author:  ghw06
 * Date:    2018/4/24 9:08
 * Description: 登录控制层  shiro控制
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

    @RequestMapping(value = "exLogin")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login/login.vm");
        return mv;
    }


   /* public String login(HttpServletRequest request) {
        //如果登录失败从request中获取认证异常信息,shiroLoginFailure就是shiro异常类的全限定名
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");

        //根据shiro返回的异常类路径判断,抛出指定异常信息
        if (exceptionClassName != null) {
            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                //最终会抛给异常处理器
                throw new BusinessException("账号不存在");
            } else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
                throw new BusinessException(CodeConstants.G_ACCOUNT_PASSWORD_INVALID);
            } else if ("randomCodeError".equals(exceptionClassName)) {
                throw new BusinessException("验证码错误");
            } else {
                throw new BusinessException(CodeConstants.G_UNKNOW);
            }
        }
        return null;
    }*/
}
