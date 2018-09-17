package com.ghostben.helloworld.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @program: helloworld
 * @description: Web页面的定向器
 * @author: ghostben
 * @create: 2018-09-17 16:13
 **/

//使用WebMvcConfigurerAdapter可以用来扩展SpringMvc的功能

//@EnableWebMvc
/*
    加了这个EnableWebMvc注解就是我们全面接管WebMvc的实现
    加了这个注解就相当于把这个类加进来了WebMvcConfigurationSupport，但是这个类只是SpringMvc的基本功能而已
    所以相当于我们的所有MVC配置都要自己配置
*/

@Configuration
public class WebPage extends WebMvcConfigurerAdapter {
    /**
     * {@inheritDoc}
     * <p>This implementation is empty
     * @param registry
     */

    //super.addViewControllers(registry);
    //浏览器发送请求，用来返回页面的方法

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
         registry.addViewController("/home").setViewName("home");
    }


}