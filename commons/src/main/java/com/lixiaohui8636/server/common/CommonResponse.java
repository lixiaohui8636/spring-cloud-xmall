package com.lixiaohui8636.server.common;

/**
 * @Author: Lee
 * @Date: 2020-07-19
 * @Desc: 通用返回结果
 */
public class CommonResponse<R> {
    private long errorCode;
    private String errorMessage;
    private R data;

    public long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(long errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public R getData() {
        return data;
    }

    public void setData(R data) {
        this.data = data;
    }
}
