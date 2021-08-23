package com.employee;

public class UC4 {

	public static void main(String[] args) {
		
		final int IS_FULL_TIME = 2;
		final int IS_PART_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		
		System.out.println("Welcome to employee wage computation problem");
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch ( empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs =8;
				break;
			default:
				empHrs = 0;
			
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("emp wage is " + empWage);
		
	}
}


