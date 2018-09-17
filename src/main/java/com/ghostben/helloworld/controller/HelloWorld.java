package com.ghostben.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: helloworld
 * @description: 一个springboot的测试程序，HelloWorld
 * @author: ghostben
 * @create: 2018-09-17 00:49
 **/

@ResponseBody
//在类名的前面添加这个ResponseBody表示这个类路径下的所有方法都是作为浏览器的处理程序
//如果是对象转为Jason数据也能写出去

@RestController
//restController 相当于ResponseBody+Controller

public class HelloWorld {

    @RequestMapping(value = "/hello")
    public String HelloWorld() {

        return "HelloWorld";
    }
}

/**
 * ========================================================
 * static  保存所有的静态文件资源,js css images
 * application.properties   springboot配置文件，可以修改一些默认的配置文件
 * templates  保存所有的模板页面，springboot使用默认的jar包形式的嵌入式tomcat，默认是不支持JSP页面的；
 *            可以使用模板引擎（freemarker，thymeleaf等）
 * ========================================================
 */