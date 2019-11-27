package com.jackinjava.blog.commons.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author LiJie on 2019/11/26
 */
public abstract class BaseEntity implements Serializable {
    private String id;

    private Timestamp createdTime;

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
