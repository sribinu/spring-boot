package com.example.practice1.controller;


import com.example.practice1.entity.Data;
import com.example.practice1.entity.Student;
import com.example.practice1.service.StudentService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@SessionAttributes("data")
public class StudentController2 {
    @Autowired
    private StudentService studentService;

//    @GetMapping("/")
//    public String homePage(Model model, HttpServletRequest request) {
//        Data data = new Data(); // Initialize Data object
//
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                if ("name".equals(cookie.getName())) {
//                    data.setName(cookie.getValue());
//                }
//            }
//        }
//
//        model.addAttribute("data", data); // Set Data object with cookie value if available
//        //model.addAttribute("data", new Data());
//        return "form";
//    }
//
//
//    @PostMapping("/process-data")
//    public String processData(@ModelAttribute("data") Data data, HttpServletResponse response,Model model) {
//        // Create a cookie for the name
//        Cookie cookie= new Cookie("name",data.getName());
//        cookie.setMaxAge(60*60*24);
//
//        //add the cookie to the response
//        response.addCookie(cookie);
//        model.addAttribute("cookie",cookie);
//
//        return "redirect:/page";
//    }
//
//    @GetMapping("/page")
//    public String page2(Model model, @CookieValue("name") String name) {
//        model.addAttribute("userName",name);
//        return "page2";
//    }

    @GetMapping("/")
    public String homePage(Model model,HttpSession session) {
        String username = (String) session.getAttribute("data");
        String newUserName = "Mr. " + username;
        model.addAttribute("name",username);
        model.addAttribute("data", new Data());
        return "form";
    }


    @PostMapping("/process-data")
    public String processData(@ModelAttribute("data") Data data, Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("data",data.getName());

        return "redirect:/page";
    }

    @GetMapping("/page")
    public String page2(Model model,HttpSession session) {
        model.addAttribute("userName",session.getAttribute("data"));
        return "page2";
    }
}
