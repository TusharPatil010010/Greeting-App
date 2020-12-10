package com.capg.greetingapp.service;

import com.capg.greetingapp.model.User;

public interface IGreetingService {

	String getMessage();
	String getMessage(User user);

}
