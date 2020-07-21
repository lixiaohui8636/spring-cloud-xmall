package com.ubestkid.lixiaohui8636.server.entities.user;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Lee
 * @Date: 2020-07-21
 * @Desc:
 */
public class UserProfileEntity implements Serializable {
    private static final long serialVersionUID = 909141246485305339L;
    private long id;
    private long userId;
    private String nickName;
    private Date userBirth;
    private String headImage;
    private int userSex;
    private String tag;
    private UserInfoEntity.Status status;
    private Date createTime;
    private Date updateTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public UserInfoEntity.Status getStatus() {
        return status;
    }

    public void setStatus(UserInfoEntity.Status status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
