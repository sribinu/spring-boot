package com.example.StudentCRUD.controller;

import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public String greet() {
        return "Student Details";
    }

    @GetMapping("students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("students/{rno}") //read
    public Student getStudentByRno(@PathVariable("rno") int rollno) {
        return studentService.getStdByRno(rollno);
    }

    @PostMapping("students") //create
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Student added successfully";
    }

    @PutMapping("students") //update
    public String updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("students/{rno}")
    public String deleteStudent(@PathVariable int rno) {
        return studentService.deleteStudent(rno);
    }
}
