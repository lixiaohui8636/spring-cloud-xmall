package com.lixiaohui8636.server.user.repository;

import com.lixiaohui8636.server.user.entities.UserProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @Author: Lee
 * @Date: 2020-07-21
 * @Desc:
 */
public interface UserProfileRepository extends JpaRepository<UserProfileEntity, Long> {
    @Query(value = "select * from user_profile where user_id = :userId", nativeQuery = true)
    public UserProfileEntity findUserProfileEntityByUserId(Long userId);
}
