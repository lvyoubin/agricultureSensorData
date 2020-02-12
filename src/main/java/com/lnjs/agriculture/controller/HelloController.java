package com.lnjs.agriculture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/view")
    public String myView(){
        return "view";
    }

    @RequestMapping("/sensorData")
    public String getSenatorData(){
        return "sensorData";
    }
}
