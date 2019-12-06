package com.jackinjava.blog.commons.controller;

import com.jackinjava.blog.commons.Action;
import com.jackinjava.blog.commons.log.Loggable;
import com.jackinjava.blog.commons.mapper.BaseMapper;
import com.jackinjava.blog.commons.model.BaseEntity;
import com.jackinjava.blog.commons.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author LiJie on 2019/11/27
 */
public abstract class BaseController<T extends BaseEntity, M extends BaseMapper, S extends BaseService<T, M>> implements Loggable {

    private S service;

    private M mapper;

    public BaseController() {
    }

    @PostMapping("save")
    public void saveEntity(@RequestBody T t){
        this.service.save(t);
    }

    protected void exec(Action action, String successed, String failed) {
        try {
            action.exec();
        } catch (Exception e) {
            this.logger().error(e.getMessage());
        }
    }

    @Autowired
    public void setService(S service) {
        this.service = service;
    }

    @Autowired
    public void setMapper(M mapper) {
        this.mapper = mapper;
    }

    public S getService() {
        return this.service;
    }

    public M getMapper() {
        return this.mapper;
    }
}
