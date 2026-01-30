package com.example.demo.mapper;

import com.example.demo.entity.Control;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ControlMapper {
    Control selectLatest();
}

