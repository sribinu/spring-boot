package com.example.FirstSpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student() {
        System.out.println("Student is created");
    }

    //@Autowired
    //@Qualifier("blackPen")
    private Tool tool; //Field Injection

    //Setter Injection
    //@Autowired
    public void setTool(Tool tool) {
        this.tool = tool;
    }

    //Constructor Injection
    @Autowired
    public Student(Tool tool) {
        this.tool = tool;
    }

    int age;
    public void show() {
        System.out.println("Hello World!");
    }
    public void writeExam() {
        tool.write();
    }
}
