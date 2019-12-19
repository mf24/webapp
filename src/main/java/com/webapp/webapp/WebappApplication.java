package com.webapp.webapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class WebappApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean(College.class);
		college.info();
		context.close();
	}



}
