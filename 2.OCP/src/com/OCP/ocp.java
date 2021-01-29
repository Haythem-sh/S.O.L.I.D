package com.OCP;

public class ocp {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		manager.setID("001");
		manager.setName("Haythem");
		manager.setBasicSalary(8500);
		
		RegularEmp regular = new RegularEmp();
		regular.setID("023");
		regular.setName("Aymen");
		regular.setBasicSalary(4200);
		
		System.out.println(manager.toString() + "Bonus : " + String.valueOf(manager.CalcHoursBonus(5)));
		System.out.println(regular.toString() + "Bonus : " + regular.CalcHoursBonus(5) );
		
	}

}
