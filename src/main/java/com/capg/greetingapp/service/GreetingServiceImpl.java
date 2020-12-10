package com.capg.greetingapp.service;

import org.springframework.stereotype.Service;

import com.capg.greetingapp.model.User;

@Service
public class GreetingServiceImpl implements IGreetingService {

	@Override
	public String getMessage() {
		return "Hello World!!";
	}

	@Override
	public String getMessage(User user) {
		if(user == null ) {
			return "Hello World";
		}
		else if(user.getFirstName() == null) {
			user.setFirstName("");
			return "Hello " + user.getLastName();
		}
		else if(user.getLastName() == null ) {
			user.setLastName("");
			return "Hello " + user.getFirstName();
		}
		else {
			return "Hello " + user.getFirstName() + " " + user.getLastName() + ".";
		}
	}
	
}
