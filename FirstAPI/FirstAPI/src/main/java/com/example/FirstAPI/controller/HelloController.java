package com.example.FirstAPI.controller;

import com.example.FirstAPI.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired //Field Injection
    HelloService service;

    public HelloController() {
        System.out.println("Controller object is created");
    }

    @GetMapping("/")
    public String greet() {
        //accepting only the request
        return service.greedy();
    }
    @GetMapping("about")
    public String aboutUs() {
        return "Creating first API using SpringBoot";
    }
}
