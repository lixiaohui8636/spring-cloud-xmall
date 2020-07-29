package com.lixiaohui8636.server.user.service.user;

import com.lixiaohui8636.server.user.entities.UserInfoEntity;
import com.lixiaohui8636.server.user.entities.UserProfileEntity;
import com.lixiaohui8636.server.user.repository.UserInfoRepository;
import com.lixiaohui8636.server.user.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Author: Lee
 * @Date: 2020-07-21
 * @Desc: 用户service
 */
@Service
public class UserServiceImpl implements UserService{
    private final UserInfoRepository userInfoRepository;
    private final UserProfileRepository userProfileRepository;

    @Autowired
    public UserServiceImpl(UserInfoRepository userInfoRepository, UserProfileRepository userProfileRepository) {
        this.userInfoRepository = userInfoRepository;
        this.userProfileRepository = userProfileRepository;
    }

    @Override
    public UserProfileEntity loginWithPhone(String phone, String channel, String deviceId, String srcApp) {
        UserInfoEntity userInfoEntity = userInfoRepository.findUserInfoEntityByPhone(phone);
        UserProfileEntity userProfileEntity;
        if(userInfoEntity == null){
            userInfoEntity = new UserInfoEntity();
            userInfoEntity.setUserName("");
            userInfoEntity.setPwd("");
            userInfoEntity.setUserType(UserInfoEntity.UserType.PHONE);
            userInfoEntity.setPhone(phone);
            userInfoEntity.setWechatUnionId("");
            userInfoEntity.setChannel(channel);
            userInfoEntity.setDeviceId(deviceId);
            userInfoEntity.setSrcApp(srcApp);
            userInfoEntity.setStatus(UserInfoEntity.Status.ENABLED);
            userInfoEntity = userInfoRepository.save(userInfoEntity);

            //手机用户XXXX
            String nickName = "手机用户" + (phone.length() < 4 ? phone : phone.substring(phone.length() - 4));

            userProfileEntity = createUserProfile(userInfoEntity.getId(),
                    nickName,
                    null,
                    "",
                    0,
                    "");
        }else{
            userProfileEntity = userProfileRepository.findUserProfileEntityByUserId(userInfoEntity.getId());
        }
        return userProfileEntity;
    }

    @Override
    public UserProfileEntity loginWithWechat(String wechatUnionId, String channel, String deviceId, String srcApp, String wechatUserInfo) {
        return null;
    }

    @Override
    public UserProfileEntity getUserProfileById(Long userId) {
        return userProfileRepository.findUserProfileEntityByUserId(userId);
    }

    @Override
    public boolean validUser(Long userId) {
        return false;
    }


    private UserProfileEntity createUserProfile(Long userId, String nickName, Date birth, String headImage, int sex, String tag){
        UserProfileEntity userProfileEntity = getUserProfileById(userId);

        //创建一个profile
        if(userProfileEntity == null){
            userProfileEntity = new UserProfileEntity();
            userProfileEntity.setUserId(userId);
            userProfileEntity.setNickName(nickName);
            userProfileEntity.setUserBirth(birth == null ? new Date() : birth);
            userProfileEntity.setHeadImage(headImage);
            userProfileEntity.setUserSex(sex);
            userProfileEntity.setTag(tag);
            userProfileEntity.setStatus(UserInfoEntity.Status.ENABLED);
            userProfileEntity = userProfileRepository.save(userProfileEntity);
        }

        return userProfileEntity;
    }
}
