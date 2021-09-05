package com.employee;

public class CompanyEmpWage {
	public final String company;
	public final int wagePerHour;
	public final int maxHoursPerMonth;
	public final int maxDaysPerMonth;
	public int totalWage;
	private int[] dailyWage;
	private int noOfDays = 0;

	CompanyEmpWage(String company, int wagePerHour, int maxHoursPerMonth, int maxDaysPerMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.maxDaysPerMonth = maxDaysPerMonth;
	}


	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
	
	public int getTotalWage() {
		return totalWage;
	}

	public void DailyWage(int perDayWage)
	{
		dailyWage = new int[50];
		dailyWage[noOfDays++] = perDayWage;
	}
	
	@Override
	public String toString() {
		return "total wage for company " + company + " is " + totalWage;
	}

}
