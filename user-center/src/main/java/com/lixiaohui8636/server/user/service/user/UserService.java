package com.lixiaohui8636.server.user.service.user;

import com.lixiaohui8636.server.user.entities.UserProfileEntity;

/**
 * @Author: Lee
 * @Date: 2020-07-21
 * @Desc:
 */
public interface UserService {
    public UserProfileEntity loginWithPhone(String phone, String channel, String deviceId, String srcApp);
    public UserProfileEntity loginWithWechat(String wechatUnionId, String channel, String deviceId, String srcApp, String wechatUserInfo);
    public UserProfileEntity getUserProfileById(Long userId);
    public boolean validUser(Long userId);

    public boolean validAk(String userAk);
    public boolean refreshAk(Long userId);
}
