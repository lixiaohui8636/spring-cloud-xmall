package com.lixiaohui8636.server.user.repository;

import com.lixiaohui8636.server.user.entities.UserProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Lee
 * @Date: 2020-07-21
 * @Desc:
 */
public interface UserProfileRepository extends JpaRepository<UserProfileEntity, Long> {
    
}
