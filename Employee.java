package com.employee;

public class Employee {
		
		final static int IS_FULL_TIME = 2;
		final static int IS_PART_TIME = 1;
		
		private final int wagePerHour;
		private final int workingHoursPerMonth; 
		private final int workingDaysPerMonth;
		private int totalEmpWage = 0;
		private final String company;
		 
		Employee(String company, int wagePerHour, int workingHoursPerMonth, int workingDaysPerMonth){
			this.company = company;
			this.wagePerHour = wagePerHour;
			this.workingDaysPerMonth = workingDaysPerMonth;
			this.workingHoursPerMonth = workingHoursPerMonth;
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
		
		
		public void totalEmployeeWage() {
			int empHrs = 0; 
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
		}

		@Override
		public String toString() {
			return "total employee wage for the company:  " +company+ " is " +totalEmpWage ;
		}
		
		
		
}


