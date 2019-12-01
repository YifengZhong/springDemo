package com.study.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach tehCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are the same
		boolean result = (tehCoach == alphaCoach);
		
		//print out the results
		System.out.println("\nPointing to the same object:" + result);
		System.out.println("\nMemory location for theCoach:" + tehCoach);
		System.out.println("\nMemory location for theCoach:" + alphaCoach);
		
		//close the context
		context.close();
	}

}
