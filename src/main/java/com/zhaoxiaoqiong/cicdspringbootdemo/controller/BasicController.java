package com.zhaoxiaoqiong.cicdspringbootdemo.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BasicController {

    @GetMapping("/hello")
    public String hello() {
        return "CI/CD is awesome";
    }
}
