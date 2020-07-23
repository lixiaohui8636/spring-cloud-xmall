package com.lixiaohui8636.server.user.repository;

import com.lixiaohui8636.server.entities.user.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Lee
 * @Date: 2020-07-21
 * @Desc:
 */
public interface UserInfoRepository extends JpaRepository<Long, UserInfoEntity> {

}
