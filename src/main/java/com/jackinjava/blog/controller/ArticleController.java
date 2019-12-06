package com.jackinjava.blog.controller;

import com.jackinjava.blog.commons.controller.BaseController;
import com.jackinjava.blog.mapper.ArticleMapper;
import com.jackinjava.blog.model.Article;
import com.jackinjava.blog.service.ArticleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiJie
 * @date 2019/12/5 17:46
 */
@RequestMapping("/article")
@RestController
public class ArticleController extends BaseController<Article, ArticleMapper,ArticleService> {

}
