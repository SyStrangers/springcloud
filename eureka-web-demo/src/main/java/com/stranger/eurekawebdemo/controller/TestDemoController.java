package com.stranger.eurekawebdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class TestDemoController {

    public static final String URL = "http://localhost:8762";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        return restTemplate.getForObject(URL+"/test",String.class);
    }

}
