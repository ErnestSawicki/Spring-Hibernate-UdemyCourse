package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load application context
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

		
		//load Bean
		Coach truckCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(truckCoach.getDailyWorkout());
		System.out.println(truckCoach.getDailyFortune());
		
		
		context.close();
	
	}

}
