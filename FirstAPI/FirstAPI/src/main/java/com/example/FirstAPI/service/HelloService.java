package com.example.FirstAPI.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public HelloService() {
        System.out.println("Service object is created");
    }
    public String greedy() {
        //Business Logic
        return "Hello Java!";
    }
}
