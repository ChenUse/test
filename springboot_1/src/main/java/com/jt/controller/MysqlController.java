package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.User;

//@Controller	//将对象交给spring容器管理
//@ResponseBody	//要求返回的数据是JSON 
				//不会执行视图解析器跳转页面
@RestController
//指定配置文件 进行加载
@PropertySource("classpath:/properties/jdbc.properties")
//@PropertySources({@PropertySource("classpath:/properties/jdbc.properties"),@PropertySource("classpath:/properties/abc.properties")})
public class MysqlController {
	/**
	 * 要求:按照指定的配置文件 为属性赋值.
	 * 1.利用@Value为属性赋值
	 * 2.批量为属性赋值
	 */
	@Value("${mysql.name}")
	private String mysqlName;
	@Value("${mysql.driver}")
	private String mysqlDriver;
	
	@Autowired
	private User user;
	
	@RequestMapping("/getMsg")
	public User getMsg() {
		
		return user;
	}
	
}
