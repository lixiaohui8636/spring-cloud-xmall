package com.lixiaohui8636.server;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: Lee
 * @Date: 2020-07-29
 * @Desc: 工具类
 */
public class Util {
    private static Pattern phoneMatcher = Pattern.compile("^1\\d{10}$");

    /**
     * 是否为正确的手机号
     * @param phone
     * @return
     */
    public static boolean isValidPhone(String phone){
        Matcher matcher = phoneMatcher.matcher(phone);
        return matcher.matches();
    }

    /**
     * 转成匿名手机号
     * @param phone
     * @return
     */
    public static String convertAnonymousPhone(String phone) {
        if (StringUtils.isEmpty(phone) || (phone.length() != 11)) {
            return phone;
        }
        return phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
    }





}


