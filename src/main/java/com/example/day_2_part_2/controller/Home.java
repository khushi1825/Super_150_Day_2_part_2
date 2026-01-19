package com.example.day_2_part_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("about")
    public String about(){
        return "This is the about page";
    }
}
