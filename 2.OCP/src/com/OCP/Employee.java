package com.OCP;

//OCP : Open Closed Principle

public abstract class Employee {
	
	public String ID;
	public String Name;
	public double BasicSalary;
    public String EmpType;
    
    
    
    public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public double getBasicSalary() {
		return BasicSalary;
	}



	public void setBasicSalary(double basicSalary) {
		BasicSalary = basicSalary;
	}



	public String getEmpType() {
		return EmpType;
	}



	public void setEmpType(String empType) {
		EmpType = empType;
	}

    

	public abstract double CalcHoursBonus(double hours);



	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + "]";
	}
	
	
}
