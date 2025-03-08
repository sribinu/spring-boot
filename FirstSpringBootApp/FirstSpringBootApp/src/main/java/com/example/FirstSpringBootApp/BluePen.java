package com.example.FirstSpringBootApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BluePen implements Tool {
    public BluePen() {
        System.out.println("Pen is created");
    }
    public void  write() {
        System.out.println("Writing using blue pen");
    }
}
