package com.employee;

public class Employee {
		
		final int IS_FULL_TIME = 2;
		final int IS_PART_TIME = 1;
		final int NUM_WORKING_DAYS = 20;
		final int EMP_RATE_PER_HOUR = 20;
		final int MAX_HRS_IN_MONTH = 100;
		
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int empCheck = 0;
		
		Employee(){
			System.out.println("Welcome to employee wage computation problem");
			empCheck = (int) Math.floor(Math.random() * 10) % 3;
		}
		
		public void isEmployeePresent() {
			empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch ( empCheck) {
				case IS_PART_TIME:
					System.out.println("Employee is working part time");
					break;
				case IS_FULL_TIME:
					System.out.println("Employee is working full time");
					break;
				default:
					System.out.println("Employee is absent");
			}
		}
		
		public void employeeWage() {
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
			System.out.println("employee wage is " + empWage);
		}
		
		public void findMonthlyWage() {
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
			//	System.out.println("emp wage is " + empWage);
				
			}
			System.out.println("Monthly wage of employee "+ totalEmpWage);
			
		}
		
		public void wageUnderCondition() {
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
				totalWorkingDays++;
				System.out.println("Day -" + totalWorkingDays + "emp hours " + empHrs);
				
			}
			totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
			System.out.println("total wage of employee under condition: "+ totalEmpWage);
		}
		
}


