package com.infogalaxy.employeewagecomp;

import java.util.Random;

public class EmployeeWageComp {

	public static void main(String[] args) {
		
		int attendance;
		int employee_type;
		int dailyWage = 0;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		Random random = new Random();
		attendance = random.nextInt(9) % 2;
		
		switch(attendance) {
		case 0:
			System.out.println("Employee is Absent");
			break;
		case 1:
			System.out.println("Employee is Present");
			employee_type = random.nextInt(9) % 2;
			switch(employee_type) {
			case 0:
				System.out.println("Employee is Part Time");
				dailyWage = WAGE_PER_HR * PART_TIME_HR;
				break;
			case 1:
				System.out.println("Employee is Full Time");
				dailyWage = WAGE_PER_HR * FULL_TIME_HR;
				break; 
			}
			System.out.println("Employee Wage = "+ dailyWage);
			break;
		}
	}

}
