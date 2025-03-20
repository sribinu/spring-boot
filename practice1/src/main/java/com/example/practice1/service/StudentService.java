package com.example.practice1.service;

import com.example.practice1.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"ADAM",2),
                    new Student(2,"SAM",4),
                    new Student(3,"ALAN",3)
            )
    );

    public List<Student> getDetails() {
        return students;
    }
}
