package com.example.ConnectingFrontEnd.controller;

import com.example.ConnectingFrontEnd.model.Student;
import com.example.ConnectingFrontEnd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500") // Allow frontend to access API
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("add/student")
    public void addStudent(@RequestParam("rno") int rno, @RequestParam("name") String name,@RequestParam("technology") String technology) {
        studentService.addStudent(rno,name,technology);

    }
}
