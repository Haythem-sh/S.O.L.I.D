package com.DIP;

public class dip {

	public static void main(String[] args) {
		
		Notification notification = new Notification(new Gmail());
		notification.sendMail();

	}

}
