package com.example.project2.webapp;

import com.example.project2.common.SampleController2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
    @Autowired
    SampleController2 sampleController2;

    
    @GetMapping("/")
    public String sample () {
        return "/sample";
    }


}
