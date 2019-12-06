package com.jackinjava.blog.model;

import com.jackinjava.blog.commons.model.BaseEntity;

import java.util.List;

/**
 * @author LiJie
 * @date 2019/12/6 10:28
 */
public class Folder extends BaseEntity {
    private String userId;

    private String name;

    private String parentId;

    private String parentName;

    private String leaf;

    private List<Article> articleList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
