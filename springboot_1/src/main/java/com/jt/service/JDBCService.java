package com.jt.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service	//将对象交给容器管理
@ConfigurationProperties(prefix="jdbc")		//指定属性前缀
public class JDBCService {
	
	//@Value("${jdbc.driver}") //spring中的spel表达式
	private String driver;
	//@Value("${jdbc.name}")
	private String name;
	
	//利用批量赋值时,需要使用set方法实行数据的赋值.
	
	public void testService() {
		System.out.println(driver+":"+name);
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
