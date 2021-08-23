package com.employee;

public class UC5 {

	public static void main(String[] args) {
		
		final int IS_FULL_TIME = 2;
		final int IS_PART_TIME = 1;
		final int NUM_WORKING_DAYS = 2;
		final int EMP_RATE_PER_HOUR = 20;
		
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		
		System.out.println("Welcome to employee wage computation problem");
		
		for(int day=0; day < NUM_WORKING_DAYS; day++) {
			
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
			totalEmpWage += empWage;
			System.out.println("emp wage is " + empWage);
			
		}
		System.out.println("total wage of emplouee "+ totalEmpWage);
		
	}
}


