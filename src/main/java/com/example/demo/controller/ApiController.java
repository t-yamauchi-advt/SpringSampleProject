package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Control;
import com.example.demo.service.AppService;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final AppService service;

    public ApiController(AppService service) {
        this.service = service;
    }

    // 最新データを返す API
    @GetMapping("/latest")
    public Control getLatest() {
        return service.getLatestControl();
    }
}
