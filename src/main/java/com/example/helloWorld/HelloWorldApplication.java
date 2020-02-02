package com.example.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/*
* 组合注解 ： 包含
* @EnableAutoConfiguration
* @ComponentScan
* @SpringBootConfiguration
*
* */
@SpringBootApplication

/**
 * 支持servlet filter listener 自动注册
 */
@ServletComponentScan
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}