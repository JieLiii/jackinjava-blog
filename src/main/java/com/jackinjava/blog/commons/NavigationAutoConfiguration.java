package com.jackinjava.blog.commons;

import com.jackinjava.blog.commons.controller.NavigationController;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LiJie on 2019/9/20
 */
@Configuration
public class NavigationAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean(
            name = {"navigationController"}
    )
    public NavigationController navigationController() {
        return new NavigationController();
    }
}
