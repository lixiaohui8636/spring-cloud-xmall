package com.lixiaohui8636.server.user.repository;

import com.ubestkid.lixiaohui8636.server.entities.user.UserProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Lee
 * @Date: 2020-07-21
 * @Desc:
 */
public interface UserProfileRepository extends JpaRepository<Long, UserProfileEntity> {
    
}
