package com.jt.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Data
//@NoArgsConstructor	//添加无参构造
//@AllArgsConstructor //添加全参构造
//@Accessors(chain=true)	//链式加载  重写了set方法
@ConfigurationProperties(prefix = "config-attributes")
@Component
public class User {
	//常规POJO实体对象 最好使用包装类型进行定义.
	//private Integer id;
	//private String	name;
	private List<Object>  valueArray = new ArrayList<>();;
	
	/**
	 * 链式加载的原理说明,可以让对象连续调用方法
	 */
	/*public User setId(Integer id) {
		
		this.id = id;
		return this;	//代表当前对象
	}
	
	public User setName(String name) {
		this.name = name;
		return this;
	}*/
}
