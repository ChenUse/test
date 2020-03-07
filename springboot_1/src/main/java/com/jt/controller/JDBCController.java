package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.service.JDBCService;

@RestController	//开启springMVC
public class JDBCController {
	
	@Autowired
	private JDBCService jdbcService;
	
	@RequestMapping("/testJDBC")
	public String testJDBC() {
		jdbcService.testService();
		return "测试成功!!!!";
	}
}
