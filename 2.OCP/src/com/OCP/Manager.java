package com.OCP;

public class Manager extends Employee {
	
	@Override
	public double CalcHoursBonus(double hours) {
		
		return (((BasicSalary/30)/8) * hours)*2;
	}

}
