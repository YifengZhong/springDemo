package com.study.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HellpSpringApp {

	public static void main(String[] args) {
		//load the spring configureation file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
