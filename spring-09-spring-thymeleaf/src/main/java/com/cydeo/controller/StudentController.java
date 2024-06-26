package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

    //@RequestMapping(value = "/register", method = RequestMethod.GET) // we don't have to provide GET method
    @GetMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";
    }

    //@RequestMapping("/welcome")
    @GetMapping("/welcome")
    public String info(){
        return "student/welcome";
    }
}

// when we work with UI we only use Get or Post. You either retrieve something or post something