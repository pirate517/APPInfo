package cn.com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 张鹏 on 2019/1/14
 */

@Controller
@RequestMapping("/doDevUser")
public class DevUserController {
    
    @RequestMapping("/login")
    public String doLogin(){
        return "devlogin";
    }
    
}
