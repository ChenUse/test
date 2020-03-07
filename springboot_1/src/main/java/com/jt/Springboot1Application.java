package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication	//springBoot主启动类
@ConfigurationProperties
public class Springboot1Application {
	
	//main方法是程序运行唯一入口.
	public static void main(String[] args) {
		//加载主启动类.
		SpringApplication.run(Springboot1Application.class, args);
	}
}
