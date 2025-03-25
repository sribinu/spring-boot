//package com.example.practice1.controller;
//
//import com.example.practice1.entity.Student;
//import com.example.practice1.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//@RestController
//@CrossOrigin(origins = "http://127.0.0.1:5500")
//public class StudentController {
//    @Autowired
//    private StudentService studentService;
//
//    @GetMapping("/all")
//    public ModelAndView printDetails() {
//        List<Student> studentList = studentService.getDetails();
//        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.addObject("details",studentList);
//        return modelAndView;
//    }
//
//    @GetMapping("/getAll")
//    public List<Student> getAll() {
//        return studentService.getDetails();
//    }
//}
