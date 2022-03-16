package com.uycode.beanLifeTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanLifeTimeApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Person person = (Person) context.getBean("person");
		person.work();
		((ClassPathXmlApplicationContext) context).destroy();
		SpringApplication.run(BeanLifeTimeApplication.class, args);
	}

}
