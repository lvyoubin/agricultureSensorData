package com.lvyb.intelligenceAgriculture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/demo")
    public String getDemo(){
        return "demo";
    }

    @RequestMapping("/index")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/detectorData")
    public String getDetectorData(){
        return "detectorData";
    }
}

