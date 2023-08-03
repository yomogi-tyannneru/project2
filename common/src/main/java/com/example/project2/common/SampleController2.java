package com.example.project2.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController2 {
    @GetMapping("/a")
    public String sample2 () {
        return "/sample2";
    }

}
