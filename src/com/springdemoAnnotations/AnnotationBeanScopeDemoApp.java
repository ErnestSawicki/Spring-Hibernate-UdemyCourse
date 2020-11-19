package com.springdemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load xml application context
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
		
		// create coaches (beans)
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//print results
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		
		//when scope is singleton - true (default), when proptype - false
		System.out.println("Are same object?: " + (tennisCoach == alphaCoach));
		
		
	
		//close context
		context.close();
		

	}

}
