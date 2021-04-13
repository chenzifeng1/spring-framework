package com.chenzifeng.learn.springcloudalibaba.web;

import com.chenzifeng.learn.springcloudalibaba.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: czf
 * @Description:
 * @Date: 2021-04-13 17:09
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/t1")
    public String getTest(){

        return testService.getBody();
    }
}