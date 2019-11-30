//Create setter methods in your class for injections.

package com.study.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside Setter method setFortuneService");
		this.fortuneService = fortuneService;
	}

}
