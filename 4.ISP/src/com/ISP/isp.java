package com.ISP;

public class isp {

	public static void main(String[] args) {
		
		System.out.println("++++++++++ Super Printer ++++++++++");
		SuperPrinter superPrinter = new SuperPrinter();
		superPrinter.print();
		superPrinter.scan();
		superPrinter.fax();
		
		System.out.println("++++++++++ Eco Printer ++++++++++");
		EcoPrinter ecoPrinter = new EcoPrinter();
		ecoPrinter.print();

	}

}
