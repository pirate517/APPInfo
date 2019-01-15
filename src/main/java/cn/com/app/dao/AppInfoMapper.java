package cn.com.app.dao;

import cn.com.app.pojo.AppInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by 张鹏 on 2019/1/14
 */
public interface AppInfoMapper {

    /**
     * 总条数
     */
    int totalRecode();

    /**
     *非级联的查询所有
     */
    List<AppInfo> getAppList(Map<String,Object> map);

}
