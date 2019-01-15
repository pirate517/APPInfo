package cn.com.app.service;

import cn.com.app.pojo.DevUser;

/**
 * Created by 张鹏 on 2019/1/14
 */
public interface DevUserService {

    /**
     * 登录
     * @param devUser
     * @return
     */
    DevUser login(DevUser devUser);

}
