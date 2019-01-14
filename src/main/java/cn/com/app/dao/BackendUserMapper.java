package cn.com.app.dao;

import cn.com.app.pojo.BackendUser;

import java.util.List;

/**
 * Created by 张鹏 on 2019/1/14
 */
public interface BackendUserMapper {

    /**
    * 后台管理登录
    */
    List<BackendUser> login(BackendUser backendUser);

}
