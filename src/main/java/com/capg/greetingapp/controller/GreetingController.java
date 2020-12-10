package com.capg.greetingapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.greetingapp.greetingdto.GreetingDto;
import com.capg.greetingapp.model.Greeting;
import com.capg.greetingapp.model.User;
import com.capg.greetingapp.service.IGreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	
	@Autowired
	private IGreetingService greetingService;
	
	@RequestMapping("/get")
	public String greetingMessage() {
		return greetingService.getMessage();
	}
	
	@PostMapping("/post")
	public String greetUser(@RequestBody User user) {
		return greetingService.getMessage(user);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Greeting> saveGreeting(@Valid @RequestBody GreetingDto greetingdto) {
		Greeting greeting = greetingService.saveGreeting(greetingdto);
		return new ResponseEntity<>(greeting, HttpStatus.OK);
	}
}
