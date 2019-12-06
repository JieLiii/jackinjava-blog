package com.jackinjava.blog.commons.mapper;

import com.jackinjava.blog.commons.model.BaseEntity;

import java.util.Map;

/**
 * @author LiJie
 * @date 2019/12/5 17:51
 */
public interface BaseMapper<T extends BaseEntity> {
    void insert(T t);

    void delete(T t);

    void update(T t);

    T select(Map<String, Object> map);
}
