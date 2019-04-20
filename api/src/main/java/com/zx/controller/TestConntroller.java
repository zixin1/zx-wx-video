package com.zx.controller;

import com.zx.service.TestService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(tags = "测试类控制器")//tags"说明该类的作用，可以在UI界面上看到的注解"value="该参数没什么意义，在UI界面上也看到，所以不需要配置
@RestController
public class TestConntroller {
    @Autowired
    TestService testService;
    @RequestMapping("/hello")
    public String hellow(){
        testService.mm("aaa","bbb",200);
        return "hello word！";
    }
}
