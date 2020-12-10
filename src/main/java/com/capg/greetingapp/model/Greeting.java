package com.capg.greetingapp.model;

public class Greeting {

	private String id;
	private String msg;
	
	public Greeting(String id, String msg) {
		super();
		this.id = id;
		this.msg = msg;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
