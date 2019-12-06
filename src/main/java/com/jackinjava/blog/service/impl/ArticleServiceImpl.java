package com.jackinjava.blog.service.impl;

import com.jackinjava.blog.commons.service.impl.BaseServiceImpl;
import com.jackinjava.blog.mapper.ArticleMapper;
import com.jackinjava.blog.model.Article;
import com.jackinjava.blog.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * @author LiJie
 * @date 2019/12/5 17:43
 */
@Service
public class ArticleServiceImpl extends BaseServiceImpl<Article, ArticleMapper> implements ArticleService {
    @Override
    public void saveArticle(Article article){
        this.getMapper().insert(article);
    }
}
