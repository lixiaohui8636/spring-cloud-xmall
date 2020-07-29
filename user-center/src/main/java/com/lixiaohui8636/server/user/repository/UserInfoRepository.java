package com.lixiaohui8636.server.user.repository;

import com.lixiaohui8636.server.user.entities.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @Author: Lee
 * @Date: 2020-07-21
 * @Desc:
 */
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long> {

    @Query(value = "select * from user_info where phone = :phone", nativeQuery = true)
    public UserInfoEntity findUserInfoEntityByPhone(String phone);
}
