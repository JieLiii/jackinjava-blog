package com.jackinjava.blog.commons.service.impl;

import com.jackinjava.blog.commons.mapper.BaseMapper;
import com.jackinjava.blog.commons.model.BaseEntity;
import com.jackinjava.blog.commons.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author LiJie on 2019/11/27
 */
public abstract class BaseServiceImpl<T extends BaseEntity, M extends BaseMapper> implements BaseService<T, M> {
    @Autowired
    private M mapper;

    @Override
    public M getMapper() {
        return mapper;
    }

    @Override
    public void save(T t) {
        mapper.insert(t);
    }
}
