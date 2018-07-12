package com.banger.lesson.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author axes
 * create at  2018/7/12  下午5:15
 * helloword controller
 */
@RestController
@RequestMapping
public class HelloWorldController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String sayHello(){
        return "this springboot hello world";
    }
}
