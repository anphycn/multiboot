package com.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App3Controller {

    @RequestMapping("/hello")
    public String hello3() {
        return "hello world";
    }
    @RequestMapping("/hello2")
    public String hello2() {
        return "hello world2";
    }

}