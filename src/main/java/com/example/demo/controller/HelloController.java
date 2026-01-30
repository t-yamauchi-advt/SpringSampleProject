package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // アノテーションを使って、Controllerクラスであることを宣言

public class HelloController {
	
	@GetMapping("/index")    
    public String index() {
        return "index";
    }
	
}