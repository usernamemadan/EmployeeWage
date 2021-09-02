package com.employee;

public class Employee {
		
		final static int IS_FULL_TIME = 2;
		final static int IS_PART_TIME = 1;
		
		Employee(){
			System.out.println("Welcome to employee wage computation problem");
		}
		
		public static void isEmployeePresent() {
			 int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
		
		
		public static void totalEmployeeWage(int wagePerHour, int workingHoursPerMonth, int workingDaysPerMonth) {
			 int empHrs = 0;
			 int totalEmpWage = 0;
			 int totalEmpHrs = 0;
			 int totalWorkingDays = 0;
			
			while ( totalEmpHrs <= workingHoursPerMonth 
					  && totalWorkingDays < workingDaysPerMonth) {
				
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
			totalEmpWage = totalEmpHrs * wagePerHour;
			System.out.println("total wage of the employee: "+ totalEmpWage);
		}
		
}


