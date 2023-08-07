package com.example.project2.webapp.controller;

import com.example.project2.webapp.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//@RequiredArgsConstructor
public class SampleController {
    @Autowired
    SampleService sampleService;

    
    @GetMapping("/")
    public String sample () {
        return "/sample";
    }

    @PostMapping("/create")
    public String create() {
        sampleService.create();
        return "redirect:/";
    }

}
