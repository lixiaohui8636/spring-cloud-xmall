package com.lixiaohui8636.server.user.entities;

/**
 * @Author: Lee
 * @Date: 2020-07-21
 * @Desc: 返回给外部的用户对象
 */
public class UserDto {
    private UserProfileEntity userProfile;
    private UserInfoDto userInfo;
    private UserAccessTokenDto userAccessToken;

    public UserProfileEntity getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfileEntity userProfile) {
        this.userProfile = userProfile;
    }

    public UserInfoDto getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoDto userInfo) {
        this.userInfo = userInfo;
    }

    public UserAccessTokenDto getUserAccessToken() {
        return userAccessToken;
    }

    public void setUserAccessToken(UserAccessTokenDto userAccessToken) {
        this.userAccessToken = userAccessToken;
    }
}
