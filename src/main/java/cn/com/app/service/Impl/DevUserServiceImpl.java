package cn.com.app.service.Impl;

import cn.com.app.dao.DevUserMapper;
import cn.com.app.pojo.DevUser;
import cn.com.app.service.DevUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 张鹏 on 2019/1/14
 */
@Service
public class DevUserServiceImpl implements DevUserService {

    @Resource
    private DevUserMapper devUserMapper;

    /**
     * 登录
     * @param devUser
     * @return
     */
    public DevUser login(DevUser devUser) {
        return devUserMapper.login(devUser);
    }
}
