package com.tamnxl.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods ...
		System.out.println("email: " + theCoach.getEmail());
		
		System.out.println("team: " + theCoach.getTeam());
		
		// close the context
		context.close();

	}

}
