package com.lixaohui8626.server.order.controller;

import com.ubestkid.lixiaohui8636.server.entities.OrderEntity;
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

    @GetMapping("/sinfo")
    public String serverInfo(@RequestParam("s") String s){

        return "order-center:" + System.currentTimeMillis() + s;
    }
}
