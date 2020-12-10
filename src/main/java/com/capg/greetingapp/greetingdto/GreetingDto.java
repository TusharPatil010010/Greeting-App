package com.capg.greetingapp.greetingdto;

import javax.validation.constraints.NotEmpty;

public class GreetingDto {
	
	@NotEmpty(message = "Name should not be null")
	public String msg;
}
