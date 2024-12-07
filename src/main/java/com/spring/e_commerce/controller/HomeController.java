package com.spring.e_commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Helloo";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }
}