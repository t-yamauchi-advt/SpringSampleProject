package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Control;

public interface ControlRepository extends JpaRepository<Control, Integer> {
	
	// 来訪日時の降順で1件取得
	Control findTopByOrderByVisitDateTimeDesc();
	
}
