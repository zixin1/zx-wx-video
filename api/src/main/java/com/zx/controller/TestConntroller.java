package com.zx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConntroller {
    @RequestMapping("/hello")
    public String hellow(){
        return "hello word！";
    }
}
