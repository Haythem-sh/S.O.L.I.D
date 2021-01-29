package com.OCP;

public class RegularEmp extends Employee {

	@Override
	public double CalcHoursBonus(double hours) {
		
		return ((BasicSalary/30)/8) * hours;
	}

}
