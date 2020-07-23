package com.lixiaohui8636.server.order.entities;

import java.util.Date;

/**
 * @Author: Lee
 * @Date: 2020-07-15
 * @Desc:
 */
public class OrderEntity {

    public enum  PaymentType{
        WECHAT_JSAPI,
        WECHAT_H5,
        WECHAT_APP,
        WECHAT_QR,
        ALIPAY_APP,
        ALIPAY_H5,
        ALIPAY_QR
    }

    public enum Status{
        WAITING,
        FINISHED,
        REFUND,
        CLOSED
    }


    private long id;
    private String outTradeId;
    private PaymentType paymentType;
    private Status status;
    private Date createTime;
    private Date updateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOutTradeId() {
        return outTradeId;
    }

    public void setOutTradeId(String outTradeId) {
        this.outTradeId = outTradeId;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
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
