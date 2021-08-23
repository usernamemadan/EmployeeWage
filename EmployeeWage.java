package com.employee;

public class UC1 {

	public static void main(String[] args) {
		
		int IS_FULL_TIME = 1;
		
		System.out.println("Welcome to employee wage computation problem");
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if( empCheck == IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
		
	}
}


