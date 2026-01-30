package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Control;
import com.example.demo.mapper.ControlMapper;

@Service
public class AppService {

    private final ControlMapper mapper;

    public AppService(ControlMapper mapper) {
        this.mapper = mapper;
    }

    public Control getLatestControl() {
        return mapper.selectLatest();
    }
}

