package com.employee;

public class CompanyEmpWage {
	public final String company;
	public final int wagePerHour;
	public final int maxHoursPerMonth;
	public final int maxDaysPerMonth;
	public int totalWage;

	CompanyEmpWage(String company, int wagePerHour, int maxHoursPerMonth, int maxDaysPerMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.maxDaysPerMonth = maxDaysPerMonth;
	}


	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	@Override
	public String toString() {
		return "total wage for company " + company + " is " + totalWage;
	}

}
