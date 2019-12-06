package com.jackinjava.blog.service;

import com.jackinjava.blog.commons.service.BaseService;
import com.jackinjava.blog.mapper.ArticleMapper;
import com.jackinjava.blog.model.Article;

/**
 * @author LiJie
 * @date 2019/12/5 17:42
 */
public interface ArticleService extends BaseService<Article, ArticleMapper> {

    void saveArticle(Article article);
}
