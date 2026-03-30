package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")

    public String greet() {
        return "Welcome To java, ap!";
    }
    @RequestMapping("/about")

    public String about() {
        return "about to welcome To java, ap!";
    }

}
