package com.lixiaohui8636.server.user.entities;

import java.util.Date;

/**
 * @Author: Lee
 * @Date: 2020-07-29
 * @Desc: 用户AK
 */
public class UserAccessTokenDto {
    private Long userId;
    private String userAk;
    private Date expireTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserAk() {
        return userAk;
    }

    public void setUserAk(String userAk) {
        this.userAk = userAk;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }


    public static final class UserAccessTokenDtoBuilder {
        private Long userId;
        private String userAk;
        private Date expireTime;

        private UserAccessTokenDtoBuilder() {
        }

        public static UserAccessTokenDtoBuilder anUserAccessTokenDto() {
            return new UserAccessTokenDtoBuilder();
        }

        public UserAccessTokenDtoBuilder withUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public UserAccessTokenDtoBuilder withUserAk(String userAk) {
            this.userAk = userAk;
            return this;
        }

        public UserAccessTokenDtoBuilder withExpireTime(Date expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        public UserAccessTokenDto build() {
            UserAccessTokenDto userAccessTokenDto = new UserAccessTokenDto();
            userAccessTokenDto.setUserId(userId);
            userAccessTokenDto.setUserAk(userAk);
            userAccessTokenDto.setExpireTime(expireTime);
            return userAccessTokenDto;
        }
    }
}
