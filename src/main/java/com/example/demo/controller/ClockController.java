package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClockController {

    @GetMapping("/clock")
    public String clock(Model model) {
    	model.addAttribute("title", "時計表示");
        return "clock";  // clock.html を返す
    }
}
