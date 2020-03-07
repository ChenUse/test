package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.Data;



class Springboot1ApplicationTests {
	
	
	
	@Test
	public void test() {
		List<Object> m = new ArrayList<>();
		m.add(1);
		m.add("2");
		m.add(new ArrayList<String>() {
			{add("3");
			add("4");
			}
		});
		m.add(new HashMap<String,String>() {{put("k1","v1");}});
		System.out.println(m);
	}

}
