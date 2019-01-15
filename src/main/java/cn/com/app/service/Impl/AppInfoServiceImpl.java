package cn.com.app.service.Impl;

import cn.com.app.dao.AppInfoMapper;
import cn.com.app.pojo.AppInfo;
import cn.com.app.pojo.Page;
import cn.com.app.service.AppInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 张鹏 on 2019/1/14
 */
@Service
public class AppInfoServiceImpl implements AppInfoService {

    @Resource
    AppInfoMapper appInfoMapper;

    public Page<AppInfo> getAppList(String num, AppInfo appInfo) {
        int pageNumber = 1;
        int pageSize = 5;
        if(num != null && num.length()>0){
            pageNumber = Integer.parseInt(num);
        }
        int pageIndex = (pageNumber - 1)*pageSize;
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("appInfo",appInfo);
        map.put("pageIndex",pageIndex);
        map.put("pageSize",pageSize);
        Page<AppInfo> page = new Page<AppInfo>();
        page.setServletURL("/appController/getAppList?pageNumber=");
        page.setPageSize(pageSize);
        page.setPageNumber(pageNumber);
        page.setTotalRecode(appInfoMapper.totalRecode());
        page.setPageData(appInfoMapper.getAppList(map));
        return page;
    }
}
