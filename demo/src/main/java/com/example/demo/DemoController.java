package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private final static String UUID_STR = UUID.randomUUID().toString();

    @RequestMapping("/fun1")
    public Object fun1(){
        return UUID_STR+"-"+System.currentTimeMillis();
    }

}
