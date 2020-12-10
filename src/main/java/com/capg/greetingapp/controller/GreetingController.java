package com.capg.greetingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
