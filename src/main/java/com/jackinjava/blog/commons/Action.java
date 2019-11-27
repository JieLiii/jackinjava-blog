package com.jackinjava.blog.commons;

/**
 * @author LiJie on 2019/11/27
 */
@FunctionalInterface
public interface Action {
    void exec() throws Exception;
}
