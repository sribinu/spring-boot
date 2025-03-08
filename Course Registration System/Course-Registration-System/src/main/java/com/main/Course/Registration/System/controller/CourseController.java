package com.main.Course.Registration.System.controller;

import com.main.Course.Registration.System.model.Course;
import com.main.Course.Registration.System.model.CourseRegistry;
import com.main.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> availableCourses() {
        return courseService.availableCourses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents() {
        return courseService.enrolledStudents();
    }

    @PostMapping("courses/register")
    public ModelAndView enrollCourse(@RequestParam("name") String name,
                                     @RequestParam("emailId") String emailId,
                                     @RequestParam("courseName") String courseName) {
        courseService.enrollCourse(name, emailId, courseName);

        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("name", name);
        modelAndView.addObject("courseName", courseName);

        return modelAndView;
    }

}
