package cn.com.app.service;

import cn.com.app.pojo.AppInfo;
import cn.com.app.pojo.Page;

/**
 * Created by 张鹏 on 2019/1/14
 */
public interface AppInfoService {

    Page<AppInfo> getAppList(String pageNum,AppInfo appInfo);

}
