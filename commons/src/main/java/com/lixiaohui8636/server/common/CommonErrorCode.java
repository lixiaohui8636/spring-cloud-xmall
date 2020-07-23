package com.lixiaohui8636.server.common;

/**
 * @Author: Lee
 * @Date: 2020-07-19
 * @Desc: 错误码通用
 */
public enum CommonErrorCode {
    USER_NOT_EXIST(1001,"用户不存在"),

    SYSTEM_ERROR(500,"系统错误");

    private long errorCode;
    private String errorMessage;

    CommonErrorCode(long errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public long getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public static CommonErrorCode parse(int intValue) {
        for (CommonErrorCode errorCode : CommonErrorCode.values()) {
            if (errorCode.errorCode == intValue) {
                return errorCode;
            }
        }
        return null;
    }
}
