package com.jackinjava.blog.commons.controller;

import com.jackinjava.blog.commons.Action;
import com.jackinjava.blog.commons.log.Loggable;
import com.jackinjava.blog.commons.model.BaseEntity;
import com.jackinjava.blog.commons.service.BaseService;

/**
 * @author LiJie on 2019/11/27
 */
public abstract class BaseController<T extends BaseEntity, S extends BaseService<T>> implements Loggable {

    protected void exec(Action action, String successed, String failed) {
        try {
            action.exec();
        } catch (Exception e) {
            this.logger().error(e.getMessage());
        }
    }
}
