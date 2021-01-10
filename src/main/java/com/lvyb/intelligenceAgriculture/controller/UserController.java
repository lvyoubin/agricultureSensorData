package com.lvyb.intelligenceAgriculture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello I'm TyCoding, this is Login test";
    }
}
