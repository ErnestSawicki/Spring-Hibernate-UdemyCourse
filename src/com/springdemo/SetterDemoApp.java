package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//retrieve bean from Spring container
		CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
				
		//call methods on the bean
				
		System.out.println(theCricketCoach.toString());
		
		//close the context
		context.close();

	}

}
