/*
 *  the SalaryCalculator Class responsible just to the calculation of Employees Salary

 *  and the Functions calcGrossSalary, calcNetSalary and CalcHoursBonus are only deals
    with the calculation of wages
 *  and for that reason we can say that the Employee class follows the notion of the Single Responsible Principle 
*/

package com.SRP;

public class SalaryCalculator {
    
    public double calcGrossSalary(double hours, double howrlyWages) {
    	
    	return hours*howrlyWages;
    }
    
    public double calcNetSalary(double Grosssalary) {
    	
    	return Grosssalary-500; 
    }
    
    public double CalcHoursBonus(double hours, double BasicSalary) {
		
		return ((BasicSalary/30)/8) * hours;
	}

}
