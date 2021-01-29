package com.LSP;

public class lsp {
	
	public static void main(String[] args) {
		
		System.out.println("*************** Bird1 *******************");
		Bird bird1 = new penguin();
		bird1.eat();
		System.out.println("*************** Bird2 *******************");
		FlyableBird bird2 = new pigeon();
		bird2.eat();
		bird2.fly();
	}
	
	

}
