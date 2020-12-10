package com.capg.greetingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.greetingapp.greetingdto.GreetingDto;
import com.capg.greetingapp.model.Greeting;
import com.capg.greetingapp.model.User;
import com.capg.greetingapp.repository.IGreetingsRepository;


@Service
public class GreetingServiceImpl implements IGreetingService {

	@Autowired
	IGreetingsRepository greetingrepository;
	
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
	
	@Override
	public Greeting saveGreeting(GreetingDto greetingdto) {
		Greeting greeting = new Greeting(greetingdto);
		greeting =  greetingrepository.save(greeting);
		return greeting;
	}

	@Override
	public Greeting getGreeting(Long id) {
		return greetingrepository.findById(id).orElseGet(null);
	}

	@Override
	public List<Greeting> getAll() {
		return greetingrepository.findAll();
	}

	@Override
	public Greeting updateGreeting(Long id, GreetingDto greetingDto) {
		Greeting greeting = getGreeting(id);
		if(greetingDto.msg != null) {
			greeting.setMsg(greetingDto.msg);
		}
		greetingrepository.save(greeting);
		return greeting;
	}
	
}
