package cn.com.app.controller;

import cn.com.app.pojo.AppInfo;
import cn.com.app.pojo.Page;
import cn.com.app.service.AppInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 张鹏 on 2019/1/14
 */
@Controller
@RequestMapping("/appController")
public class AppInfoController {

    @Resource
    AppInfoService appInfoService;

    @RequestMapping("/getAppList")
    public String doGetAppList(String pageNumber, AppInfo appInfo, HttpServletRequest request){
        Page<AppInfo> page = appInfoService.getAppList(pageNumber,appInfo);
        request.setAttribute("Page",page);
        return "/developer/appinfolist";
    }

}
