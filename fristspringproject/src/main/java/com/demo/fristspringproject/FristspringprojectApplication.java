package com.demo.fristspringproject;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FristspringprojectApplication {

	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("spring.xml");

		Entity obj2 = (Entity)obj.getBean("entity");

		obj2.code();
		System.out.println(obj2.getAge());
	}

}
