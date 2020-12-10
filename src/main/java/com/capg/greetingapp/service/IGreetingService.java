package com.capg.greetingapp.service;

import java.util.List;

import com.capg.greetingapp.greetingdto.GreetingDto;
import com.capg.greetingapp.model.Greeting;
import com.capg.greetingapp.model.User;

public interface IGreetingService {

	String getMessage();
	String getMessage(User user);
	Greeting saveGreeting(GreetingDto greetingdto);
	Greeting getGreeting(Long id);
	List<Greeting> getAll();

}
