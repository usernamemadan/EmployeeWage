package com.employee;

import java.util.ArrayList;
import java.util.List;

public class EmpWageBuilder implements AddCompany{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;

	private ArrayList<CompanyEmpWage> companyEmpWage;

	EmpWageBuilder() {
		companyEmpWage = new ArrayList<CompanyEmpWage>();
	}

	public void addCompanyEmpWage(String company, int wagePerHour, int maxHoursPerMonth, int maxDaysPerMonth) {
		companyEmpWage.add( new CompanyEmpWage(company, wagePerHour, maxHoursPerMonth, maxDaysPerMonth));
	}

	
	public void computeEmpWage() {

		for (int i = 0; i < companyEmpWage.size(); i++) {

			int totalHours, totalDays, empHour;
			totalHours = totalDays = empHour = 0;

			while (totalHours < companyEmpWage.get(i).maxHoursPerMonth && totalDays < companyEmpWage.get(i).maxDaysPerMonth) {
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
				int dailyWage = 0;
				dailyWage = empHour * companyEmpWage.get(i).wagePerHour;
				System.out.println("Day::" + totalDays + " Emp hour" + empHour+ " Daily wage: " + dailyWage );
				companyEmpWage.get(i).DailyWage(dailyWage);

			}

			companyEmpWage.get(i).setTotalWage(totalHours * companyEmpWage.get(i).wagePerHour);
			System.out.println(companyEmpWage.get(i));
		}

	}


}
