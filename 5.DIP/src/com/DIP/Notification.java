package com.DIP;

public class Notification {
	
	private IMail mailService;
	
	// Constructor Injection
	public Notification(IMail mailService) {
		super();
		this.mailService = mailService;
	}
    
	public void sendMail() { 
		
		mailService.send();
	}
	
}
