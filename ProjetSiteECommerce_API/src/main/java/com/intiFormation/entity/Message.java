package com.intiFormation.entity;

public class Message {
	
	private String message;
	
	

	public String getMessage() {
		System.out.println("Modification");
		return message;
		
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Message(String message) {
		super();
		this.message = message;
	}

	public Message() {
		super();
	}
	
	

}
