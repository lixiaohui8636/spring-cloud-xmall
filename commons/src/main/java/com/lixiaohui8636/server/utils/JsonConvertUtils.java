package com.lixiaohui8636.server.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Author: Lee
 * @Date: 2020-07-17
 * @Desc: json统一管理
 */
public class JsonConvertUtils {
    private static final Gson gson = new GsonBuilder().disableHtmlEscaping().create();

    public static String toJson(Object object){
        return gson.toJson(object);
    }

    public static <T> T parseToObject(String json, Class<T> tClass){
        return gson.fromJson(json, tClass);
    }

}
