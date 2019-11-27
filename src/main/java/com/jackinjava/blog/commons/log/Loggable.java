package com.jackinjava.blog.commons.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author LiJie on 2019/11/27
 */
public interface Loggable {
    default Logger logger() {
        return LoggerFactory.getLogger(this.getClass());
    }
}
