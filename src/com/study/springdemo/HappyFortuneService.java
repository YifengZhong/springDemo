package com.study.springdemo;

public class HappyFortuneService implements FortuneService{
	
	
	private String [] fortunes= new String[] {
		"Fortune1","Fortune2","Fortune3"
	};

	@Override
	public String getFortune() {
		Integer indx = (int)(Math.random() * 3);
		System.out.println("indx:"+indx);
		return fortunes[indx];
	}

}
