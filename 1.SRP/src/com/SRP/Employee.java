/*
 * our Employee Class is responsible just to define attributes and Methods of employee

 * and for that reason we can say that the Employee class follows the notion of the Single Responsible Principle 
*/

package com.SRP;

public class Employee {
	
	public int ID;
	public String Name;
	public double BasicSalary;
	
	
	
	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public double getBasisSalary() {
		return BasicSalary;
	}

	public void setBasisSalary(double basisSalary) {
		this.BasicSalary = basisSalary;
	}

	@Override
	public String toString() {
		return "Employee [ID = " + ID + ", Name = " + Name + "]";
	}

}
