package com.study.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//Create Objects
		Coach theCoach = new TrackCoach();
		// use object
		System.out.println(theCoach.getDailyWorkout());
	}

}
