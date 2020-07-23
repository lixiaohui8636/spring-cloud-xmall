package com.lixiaohui8636.server.user.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: Lee
 * @Date: 2020-07-15
 * @Desc:
 */
@Entity
@Table(name = "user_info", schema = "xmall")
public class UserInfoEntity implements Serializable {
    private static final long serialVersionUID = -180751959625645612L;

    public enum UserType{
        PHONE,WECHAT,GUEST
    }

    public enum Status{
        ENABLED,DELETED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String pwd;
    private UserType userType;
    private String phone;
    private String wechatUnionId;
    private String channel;
    private String deviceId;
    private String srcApp;

    @Column(name = "status", insertable = false)
    private Status status;
    @Column(name = "create_time", insertable = false, updatable = false)
    private String createTime;
    @Column(name = "update_time", insertable = false, updatable = false)
    private String updateTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWechatUnionId() {
        return wechatUnionId;
    }

    public void setWechatUnionId(String wechatUnionId) {
        this.wechatUnionId = wechatUnionId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSrcApp() {
        return srcApp;
    }

    public void setSrcApp(String srcApp) {
        this.srcApp = srcApp;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
