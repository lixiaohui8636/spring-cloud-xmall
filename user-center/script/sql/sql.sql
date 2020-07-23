CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_name` varchar(128) NOT NULL DEFAULT '0' COMMENT '用户名',
  `pwd` varchar(256) NOT NULL DEFAULT '0' COMMENT '密码',
  `user_type` enum('PHONE','WECHAT','GUEST') NOT NULL DEFAULT 'GUEST' COMMENT '用户类型',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机号',
  `wechat_union_id` varchar(50) DEFAULT NULL COMMENT '微信unionId',
  `device_id` varchar(128) DEFAULT NULL COMMENT '注册设备id',
  `src_app` varchar(128) DEFAULT NULL COMMENT '应用包名',
  `status` enum('ENABLED','DELETED') NOT NULL DEFAULT 'ENABLED',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `phone` (`phone`),
  KEY `wechat_union_id` (`wechat_union_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7635389574 DEFAULT CHARSET=utf8 COMMENT='用户信息表';


CREATE TABLE `user_profile` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '用户ID',
  `nick_name` varchar(32) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '昵称',
  `user_birth` datetime DEFAULT NULL COMMENT '用户生日',
  `head_image` varchar(1024) DEFAULT NULL COMMENT '用户头像',
  `user_sex` int(1) DEFAULT '0' COMMENT '性别 1男 2女',
  `tag` varchar(1024) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT 'tag补充信息',
  `status` enum('ENABLED','DELETED') NOT NULL DEFAULT 'ENABLED',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户设置表';



