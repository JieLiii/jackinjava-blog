package com.jackinjava.blog.model;

import com.jackinjava.blog.commons.model.BaseEntity;

/**
 * 文章
 *
 * @author LiJie
 * @date 2019/12/5 17:12
 */
public class Article extends BaseEntity {
    private String title;

    private String content;

    private String contentHtml;

    private String userName;

    private String userCode;

    private String folderId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentHtml() {
        return contentHtml;
    }

    public void setContentHtml(String contentHtml) {
        this.contentHtml = contentHtml;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }
}
