package com.infogalaxy.employeewagecomp;

import java.util.Scanner;

public class EmployeeWageComp {

	public static void main(String[] args) {
		
		int attendance = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation Program");
		
		System.out.println("Enter the Attendance: [0-Absent / 1-Present]:");
		attendance = sc.nextInt();
		
		if(attendance == 0) {
			System.out.println("Employee is Absent");
		}
		else {
			System.out.println("Employee is Present");
		}
	}

}
