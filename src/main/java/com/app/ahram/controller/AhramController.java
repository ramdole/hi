package com.app.ahram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AhramController {

    @GetMapping("/hi")
    public String Greeting(Model model) {
        model.addAttribute("username","람돌이");
        return "greetings";
    }
}
