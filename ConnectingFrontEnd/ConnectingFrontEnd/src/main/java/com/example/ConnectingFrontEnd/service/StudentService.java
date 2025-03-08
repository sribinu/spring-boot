package com.example.ConnectingFrontEnd.service;

import com.example.ConnectingFrontEnd.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Adam","Front End"),
                    new Student(2,"Ben","Middleware"),
                    new Student(3,"Carles","Back End")
                    )
    );

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(int rno, String name, String technology) {
        students.add(new Student(rno, name, technology));
    }
}
