package com.example.FirstSpringBootApp;

import org.springframework.stereotype.Component;

@Component
public class BlackPen implements Tool {
    public void write() {
        System.out.println("Writing using black pen");
    }
}
