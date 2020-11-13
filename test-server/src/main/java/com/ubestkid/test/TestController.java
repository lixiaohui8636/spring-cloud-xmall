package com.ubestkid.test;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: Lee
 * @Date: 2020-08-06
 * @Desc:
 */
@RestController
public class TestController {
    private Map<String,Map<String,Object>> tokenCache = Maps.newHashMap();

    @RequestMapping("/time")
    public String time(){
        return "上海时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }


    @RequestMapping(value = "/login", produces = "application/json;charset=utf-8")
    public Map<String,Object> login(@RequestParam("user_name")String userName, @RequestParam("pass_word")String password){
        Map<String,Object> map = Maps.newHashMap();
        if("zyl".equals(userName) && "zyl123".equals(password)){
            map.put("errorCode",0);
            map.put("errorMsg","success");
            String token = UUID.randomUUID().toString();
            Map<String,Object>  user = Maps.newHashMap();
            user.put("userName",userName);
            user.put("nickName","大乖乖");
            tokenCache.put(token,user);
            Map<String,Object> data = Maps.newHashMap();
            data.put("token", token);
            map.put("data",data);
        }else{
            map.put("errorCode",10001);
            map.put("errorMsg","用户名或密码错误");
        }
        return map;
    }

    @RequestMapping(value = "/userInfo", produces = "application/json;charset=utf-8")
    public Map<String,Object> login(@RequestParam("token")String token){
        Map<String,Object> user = tokenCache.get(token);
        Map<String,Object> map = Maps.newHashMap();
        if(user != null){
            map.put("errorCode",0);
            map.put("errorMsg","success");
            map.put("data",user);
        }else{
            map.put("errorCode",10002);
            map.put("errorMsg","token错误");
        }
        return map;
    }

}
