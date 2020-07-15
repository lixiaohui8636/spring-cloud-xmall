package com.ubestkid.lixiaohui8636.server.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Lee
 * @Date: 2020-07-15
 * @Desc:
 */
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 5582177012942968407L;
    private long id;
    private String userName;
    private String phone;
    private String wxUnionId;
    private Date crateTime;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWxUnionId() {
        return wxUnionId;
    }

    public void setWxUnionId(String wxUnionId) {
        this.wxUnionId = wxUnionId;
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
