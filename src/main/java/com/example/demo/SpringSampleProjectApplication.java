package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
@EnableJpaRepositories(basePackages = "com.example.demo.repository")
public class SpringSampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSampleProjectApplication.class, args);
	}

}
