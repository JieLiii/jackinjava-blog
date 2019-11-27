package com.jackinjava.blog.commons.utils;

import java.util.UUID;

/**
 * @author LiJie on 2019/11/27
 */
public interface BaseUtils {
    default String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
