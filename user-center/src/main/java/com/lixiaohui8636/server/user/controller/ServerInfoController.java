package com.lixiaohui8636.server.user.controller;

import com.lixiaohui8636.server.user.entities.UserInfoEntity;
import com.lixiaohui8636.server.user.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Lee
 * @Date: 2020-07-17
 * @Desc:
 */
@RestController
public class ServerInfoController {
    @Autowired
    UserInfoRepository userInfoRepository;

    @GetMapping("/sinfo")
    public String serverInfo(@RequestParam("s") String s){
        return "user-center0:" + System.currentTimeMillis() + s;
    }

    @GetMapping("/save")
    public String save(){
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        userInfoEntity.setUserName("张三");
        userInfoEntity.setPwd("xxxx");
        userInfoEntity.setUserType(UserInfoEntity.UserType.GUEST);
        //userInfoEntity.setStatus(UserInfoEntity.Status.ENABLED);
        userInfoRepository.save(userInfoEntity);
        return System.currentTimeMillis()+"";
    }
}
