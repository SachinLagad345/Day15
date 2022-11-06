package com.bridgelabz.day9;

import java.util.Random;

public class EmployeeWage {

	public boolean isEmployeePresent(int p) {
		if (p == 1 || p == 2)
			return true;
		else
			return false;
	}

	public int calculateWage(int p,int wagePerHour, int prtHours,int fullHours) {
		int wage = 0;
		if (isEmployeePresent(p)) {
			if (p == 2)
				wage = wagePerHour * prtHours;
			else
				wage = wagePerHour * fullHours;
		} else
			wage = 20 * 0;

		return wage;
	}

	public int calculateMonthlyWage(int p, int wagePerHour, int prtHours, int fullHours) {
		int wage = 0;
		if (isEmployeePresent(p)) {
			if (p == 2)
				wage = 20 * wagePerHour * prtHours;
			else
				wage = 20 * wagePerHour * fullHours;
		} else
			wage = 20 * wagePerHour * 0;

		return wage;
	}
	
	public void monthlyCalculatedWage(int days,int hours,int prtHours,int fullHours, int wagePerHOur,String company)
	{
		Random rnd = new Random();
		int dayCount = 0;
		int hrs = 0;
		int wage = 0;
		
		while (dayCount < days && hrs < hours) {
			int p = rnd.nextInt(3);
			dayCount++;
			switch (p) {
			case 0:
				//System.out.println("Employee is absent");
				//System.out.println("Employee daily wage is " + calculateWage(p, wagePerHOur, prtHours, fullHours));
				hrs += 0;
				wage += 0;
				break;
			case 1:
				System.out.println("Employee is present full time");
				System.out.println("Employee daily wage is " + calculateWage(p, wagePerHOur, prtHours, fullHours));

				if((hrs+fullHours) > hours)
				{
					int extra = (hrs+fullHours)-hours;
					hrs += (fullHours-extra);
					wage += wagePerHOur * extra;
				}
				else
				{
					hrs += fullHours;
					wage += wagePerHOur * fullHours;	
				}
				break;
			case 2:
				System.out.println("Employee is present part time");
				System.out.println("Employee daily wage is " + calculateWage(p, wagePerHOur, prtHours, fullHours));
				if((hrs+prtHours) > hours)
				{
					int extra = (hrs+prtHours)-hours;
					hrs += (prtHours-extra);
					wage += wagePerHOur * extra;
				}
				else
				{
					hrs += prtHours;
					wage += wagePerHOur * prtHours;	
				}
				break;
			default:
				break;
			}

		}
		
		System.out.println("Total wage for company "+ company+ " for " + dayCount + " days and " + hrs + " hours is " + wage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to employee wage computaion program!");

		EmployeeWage emp = new EmployeeWage();
//					if(emp.isEmployeePresent(p))
//						System.out.println("Employee is present!");
//					else
//						System.out.println("Employee is absent!");
//					
//					if(p == 2)
//						System.out.println("Employee is part time");
//					else
//						System.out.println("Employee is full time");
//					
//					int wage = emp.calculateWage(p);
//					System.out.println("Employee wage is " + wage);
		
		System.out.println("calculating wage for company A ");
		emp.monthlyCalculatedWage(30, 100, 4, 8, 20, "A");
		System.out.println("\n");
		System.out.println("calculating wage for company B ");
		emp.monthlyCalculatedWage(20, 60, 3, 10, 30, "B");
		System.out.println("\n");
		System.out.println("calculating wage for company C ");
		emp.monthlyCalculatedWage(40, 120, 4, 10, 30, "C");

	}

}
