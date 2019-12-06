package com.jackinjava.blog.commons.service;

import com.jackinjava.blog.commons.log.Loggable;
import com.jackinjava.blog.commons.mapper.BaseMapper;
import com.jackinjava.blog.commons.model.BaseEntity;

/**
 * @author LiJie on 2019/11/27
 */
public interface BaseService<T extends BaseEntity, M extends BaseMapper> extends Loggable {
    M getMapper();

    void save(T t);
}
