package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//retrieve bean from Spring container
		CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//with test of BeanScope -> homework
		SpringCoach springCoachOne = context.getBean("mySpringCoach", SpringCoach.class);
		SpringCoach springCoachTwo = context.getBean("mySpringCoach", SpringCoach.class);
		
		//call methods on the bean
				
		System.out.println(theCricketCoach.toString());
		
		System.out.println();
		System.out.println("Are springCoaches the same object? " + (springCoachOne==springCoachTwo));
		System.out.println();
		System.out.println(springCoachOne.toString());
		System.out.println(springCoachTwo.toString());
		
		//close the context
		context.close();

	}

}
