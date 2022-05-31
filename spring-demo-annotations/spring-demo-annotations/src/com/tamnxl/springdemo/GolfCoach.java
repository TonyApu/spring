package com.tamnxl.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "Do push up 5 times a day.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
