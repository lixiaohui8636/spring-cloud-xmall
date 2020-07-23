package com.lixiaohui8636.server.user.service.user;

import com.lixiaohui8636.server.entities.user.UserProfileEntity;

/**
 * @Author: Lee
 * @Date: 2020-07-21
 * @Desc: 用户service
 */
public class UserServiceImpl implements UserService{

    @Override
    public UserProfileEntity loginWithPhone(String phone, String channel, String deviceId, String srcApp) {
        return null;
    }

    @Override
    public UserProfileEntity loginWithWechat(String wechatUnionId, String channel, String deviceId, String srcApp, String wechatUserInfo) {
        return null;
    }

    @Override
    public UserProfileEntity getUserProfileById(long userId) {
        return null;
    }

    @Override
    public boolean validUser(long userId) {
        return false;
    }
}
