package com.employee;

public class UC2 {

	public static void main(String[] args) {
		
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		
		System.out.println("Welcome to employee wage computation problem");
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if( empCheck == IS_FULL_TIME)
			empHrs = 8;
		else
			empWage = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("emp wage is " + empWage);
		
	}
}


