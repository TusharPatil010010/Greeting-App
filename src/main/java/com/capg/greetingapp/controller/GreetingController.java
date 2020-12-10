package com.capg.greetingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.greetingapp.model.Greeting;

@RestController
public class GreetingController {
	
	@RequestMapping("/welcome")
	public Greeting getMessage() {
		return new Greeting("Welcome", "Welcome to this page..");
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/greet")
	public Greeting postMessage(@RequestBody Greeting greeting ) {
		return greeting;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/put/{id}")
	public Greeting updateMessage(@PathVariable String id, @RequestBody Greeting greeting) {
		return greeting;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/{id}")
	public void delete(@PathVariable String id, @RequestBody Greeting greeting) {
		greeting.setId(null);
		greeting.setMsg(null);
	}
}
