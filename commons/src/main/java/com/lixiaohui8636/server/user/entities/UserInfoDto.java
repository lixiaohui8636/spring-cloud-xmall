package com.lixiaohui8636.server.user.entities;

/**
 * @Author: Lee
 * @Date: 2020-07-29
 * @Desc:
 */
public class UserInfoDto {
    private Long userId;
    private String anonymousPhone;
    private String userName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAnonymousPhone() {
        return anonymousPhone;
    }

    public void setAnonymousPhone(String anonymousPhone) {
        this.anonymousPhone = anonymousPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static final class UserInfoDtoBuilder {
        private Long userId;
        private String anonymousPhone;
        private String userName;

        private UserInfoDtoBuilder() {
        }

        public static UserInfoDtoBuilder anUserInfoDto() {
            return new UserInfoDtoBuilder();
        }

        public UserInfoDtoBuilder withUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public UserInfoDtoBuilder withAnonymousPhone(String anonymousPhone) {
            this.anonymousPhone = anonymousPhone;
            return this;
        }

        public UserInfoDtoBuilder withUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserInfoDto build() {
            UserInfoDto userInfoDto = new UserInfoDto();
            userInfoDto.setUserId(userId);
            userInfoDto.setAnonymousPhone(anonymousPhone);
            userInfoDto.setUserName(userName);
            return userInfoDto;
        }
    }
}
