package com.springdemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
		//get the bean from spring container
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach springAnnotetedCoach = context.getBean("annotatedCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(springAnnotetedCoach.getDailyWorkout());
		System.out.println(springAnnotetedCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
