package com.jackinjava.blog.commons.model;

import com.jackinjava.blog.commons.utils.BaseUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author LiJie on 2019/11/26
 */
public abstract class BaseEntity implements Serializable {
    private String id;

    private Timestamp createdTime;

    public BaseEntity() {
        if(StringUtils.isBlank(id)){
            id = BaseUtils.getUUID();
        }
        createdTime = new Timestamp(System.currentTimeMillis());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }
}
