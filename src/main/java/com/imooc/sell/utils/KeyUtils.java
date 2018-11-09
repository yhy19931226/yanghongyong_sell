package com.imooc.sell.utils;

import java.util.Random;

public class KeyUtils {

    /**
     * 生成随机数（时间搓加上6位随机数）
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
