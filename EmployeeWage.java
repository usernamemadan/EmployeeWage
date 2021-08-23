package com.employee;

public class UC6 {

	public static void main(String[] args) {
		
		final int IS_FULL_TIME = 2;
		final int IS_PART_TIME = 1;
		final int NUM_WORKING_DAYS = 2;
		final int EMP_RATE_PER_HOUR = 20;
		final int MAX_HRS_IN_MONTH = 10;
		
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		
		System.out.println("Welcome to employee wage computation problem");
		
		while ( totalEmpHrs <= MAX_HRS_IN_MONTH 
				  && totalWorkingDays < NUM_WORKING_DAYS) {
			
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
			totalEmpHrs += empHrs;
			System.out.println("Day -" + totalWorkingDays + "emp hours " + empHrs);
			
		}
		totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("total wage of emplouee "+ totalEmpWage);
		
	}
}


