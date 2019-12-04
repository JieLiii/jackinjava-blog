package com.jackinjava.blog;

import com.jackinjava.blog.commons.NavigationAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * @author LiJie on 2019/11/25
 */
@SpringBootApplication
@Import(NavigationAutoConfiguration.class)
@MapperScan("com.jackinjava.blog.mapper")
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }
}
