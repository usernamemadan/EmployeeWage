package com.employee;

public class EmpWageBuilder implements AddCompany{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;

	private CompanyEmpWage[] companyEmpWage;

	EmpWageBuilder() {
		companyEmpWage = new CompanyEmpWage[5];
	}

	public void addCompanyEmpWage(String company, int wagePerHour, int maxHoursPerMonth, int maxDaysPerMonth) {
		companyEmpWage[numOfCompany] = new CompanyEmpWage(company, wagePerHour, maxHoursPerMonth, maxDaysPerMonth);
		numOfCompany += 1;
	}

	
	public void computeEmpWage() {

		for (int i = 0; i < numOfCompany; i++) {

			int totalHours, totalDays, empHour;
			totalHours = totalDays = empHour = 0;

			while (totalHours < companyEmpWage[i].maxHoursPerMonth && totalDays < companyEmpWage[i].maxDaysPerMonth) {
				totalDays += 1;
				int attendance = (int) Math.floor(Math.random() * 10) % 3;

				switch (attendance) {
				case IS_FULL_TIME:
					empHour = 8;
					break;
				case IS_PART_TIME:
					empHour = 4;
					break;
				default:
					empHour = 0;
				}
				totalHours += empHour;
				System.out.println("Day::" + totalDays + " Emp hour" + empHour);

			}

			companyEmpWage[i].setTotalWage(totalHours * companyEmpWage[i].wagePerHour);
			System.out.println(companyEmpWage[i]);
		}

	}


}
