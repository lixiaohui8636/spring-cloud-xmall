package com.lixiaohui8636.server.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: Lee
 * @Date: 2020-07-17
 * @Desc:
 */
@RestController
public class ServerInfoController {

    @GetMapping("/sinfo")
    public String serverInfo(@RequestParam("s") String s){
        return "user-center:" + System.currentTimeMillis() + s;
    }
}
