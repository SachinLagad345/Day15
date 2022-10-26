package com.bridgelabz.day4;

import java.util.Random;

public class EmployeeWage {

	public boolean isEmployeePresent(int p)
	{
		if(p == 1)
			return true;
		else
			return false;
	}
	
	public int calculateWage(int p)
	{
		int wage = 0;
		if(isEmployeePresent(p))
			wage = 20*8;
		else
			wage = 20*0;
			
		return wage;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			System.out.println("Welcome to employee wage computaion program!");
			Random rnd = new Random();
			int p = rnd.nextInt(2);
			EmployeeWage emp = new EmployeeWage();
			if(emp.isEmployeePresent(p))
				System.out.println("Employee is present!");
			else
				System.out.println("Employee is absent!");
			
			int wage = emp.calculateWage(p);
			System.out.println("Employee wage is " + wage);
			
		}

}
