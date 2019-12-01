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
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMystartupStuff");
	}
	//add a destroy method
	//!!!!! For"prototype" scoped beans, Spring does not call the destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}

}
