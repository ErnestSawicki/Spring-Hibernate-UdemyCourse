package com.springdemoAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
	public static void main(String[] args) {
		//read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring container
		
		//Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		//Coach springAnnotetedCoach = context.getBean("annotatedCoach", Coach.class);
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call a method on the bean
		/*
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(springAnnotetedCoach.getDailyWorkout());
		System.out.println(springAnnotetedCoach.getDailyFortune());
		*/
		System.out.println("swimCoach email:"+swimCoach.getEmail());
		System.out.println("swimCoach team:"+swimCoach.getTeam());
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
