package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		//load the Spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from the Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		System.out.println("Is it the same object: " + result);
	
		
		System.out.println("theCoach hashCode: " + theCoach.hashCode());
		System.out.println("alphaCoach hashCode: " + alphaCoach.hashCode());
		
		System.out.println("Memory location for theCoach: " + theCoach);
		System.out.println("Memory location for theCoach: " + alphaCoach);
		
	}

}
