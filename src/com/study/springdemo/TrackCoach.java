package com.study.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 6K";
	}
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It:" + fortuneService.getFortune();
	}

}
