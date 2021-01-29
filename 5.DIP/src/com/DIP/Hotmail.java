package com.DIP;

public class Hotmail implements IMail {
	
	public String Address;
	public String from;
	public String toAdress;

	@Override
	public void send() {
		
		System.out.println("This Message from Hotmail");

	}

}
