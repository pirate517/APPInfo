package cn.com.app.dao;

import cn.com.app.pojo.DevUser;

/**
 * Created by 张鹏 on 2019/1/14
 */
public interface DevUserMapper {

    /**
     * 开发者登录方法
     * @param devUser
     * @return
     */
    DevUser login(DevUser devUser);

}
