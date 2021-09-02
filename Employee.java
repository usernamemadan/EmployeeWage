package com.employee;

public class Employee {
		
		final static int IS_FULL_TIME = 2;
		final static int IS_PART_TIME = 1;
		final static int NUM_WORKING_DAYS = 20;
		final static int EMP_RATE_PER_HOUR = 20;
		final static int MAX_HRS_IN_MONTH = 100;
		
		static int empHrs = 0;
		static int empWage = 0;
		static int totalEmpWage = 0;
		static int totalEmpHrs = 0;
		static int totalWorkingDays = 0;
		static int empCheck = 0;
		
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
		
		public static void employeeWage() {
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
		
		
		public static void totalEmployeeWage() {
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
				System.out.println("Day -" + totalWorkingDays + " emp hours " + empHrs);
				
			}
			totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
			System.out.println("total wage of the employee: "+ totalEmpWage);
		}
		
}


