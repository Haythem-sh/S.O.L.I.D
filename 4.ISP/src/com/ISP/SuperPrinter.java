package com.ISP;

public class SuperPrinter implements IFax, IScanner, IPrinter {

	@Override
	public void print() {
		
		System.out.print("I can print ");

	}

	@Override
	public void scan() {
		
		System.out.print("scan ");

	}

	@Override
	public void fax() {
		
		System.out.println("and fax a document");

	}

}
