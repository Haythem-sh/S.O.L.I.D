package com.SRP;

public class srp {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setID(001);
		employee.setName("Haythem");
		
		SalaryCalculator calculator  = new SalaryCalculator();
		System.out.println(employee.toString());
		
		double GrossSalary = calculator.calcGrossSalary(140, 25.28);
		double netSalary = calculator.calcNetSalary(GrossSalary);
		System.out.println("GrossSalary = " + GrossSalary);
		System.out.println("netSalary = " + netSalary);
		
		employee.setBasisSalary(netSalary);
		System.out.println("Bonus = " + calculator.CalcHoursBonus(5,employee.getBasisSalary()));
		
	}

}
