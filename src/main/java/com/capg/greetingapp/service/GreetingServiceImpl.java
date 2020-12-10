package com.capg.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService {

	@Override
	public String getMessage() {
		return "Hello World!!";
	}

}
