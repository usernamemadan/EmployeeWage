package com.employee;

public class Main {
	public static void main(String[] args) {
		EmpWageBuilder  emp = new EmpWageBuilder();
		emp.addCompanyEmpWage("Nokia", 50 ,20 , 10);
		emp.addCompanyEmpWage("Samsung", 60 ,20 , 20);
		emp.computeEmpWage();
	}
}
