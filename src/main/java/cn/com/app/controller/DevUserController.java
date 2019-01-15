package cn.com.app.controller;

import cn.com.app.pojo.DevUser;
import cn.com.app.service.DevUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 张鹏 on 2019/1/14
 */

@Controller
@RequestMapping("/doDevUser")
public class DevUserController {

    @Resource
    private DevUserService devUserService;

    /**
     * 开发者index跳转login
     * */
    @RequestMapping("/jump")
    public String doJump(){
        return "devlogin";
    }


    /**
     * 开发者登录
     */
    @RequestMapping("/login")
    public String doLogin(DevUser devUser, HttpServletRequest request){
        DevUser dev = devUserService.login(devUser);
        if(dev == null){
            request.setAttribute("message","账户或密码错误，请重新输入");
            return InternalResourceViewResolver.FORWARD_URL_PREFIX+"/WEB-INF/jsp/devlogin.jsp";
        }
        request.getSession().setAttribute("devUserSession",dev);
        return "developer/main";
    }

    /**
     * 开发者登出
     */
    @RequestMapping("/logout")
    public String doLogout(){
        return InternalResourceViewResolver.FORWARD_URL_PREFIX+"/index.jsp";
    }
}
