package com.employee;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee("airtel",40, 35 , 30);
		employee1.isEmployeePresent();
		employee1.totalEmployeeWage();
		
		Employee employee2 = new Employee("jio",79, 40 , 23);
		employee2.isEmployeePresent();
		employee2.totalEmployeeWage();
		
		System.out.println(employee1);
		System.out.println(employee2);
		
	}
}
