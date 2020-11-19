package com.springdemoAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySuperMainApp {
	public static void main(String[] args) {
		//context config
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SuperConfig.class);
		//beans
		MySuperCoach superCoach = context.getBean("mySuperCoach", MySuperCoach.class);
		//deliver from beans
		System.out.println(superCoach.getDailyWorkout());
		System.out.println(superCoach.getDailyFortune());
		
		//close context
		context.close();
	}

}
