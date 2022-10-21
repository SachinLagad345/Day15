package com.bridgelabz.day3;

import java.util.Random;

public class EmployeeWage {

	public boolean isEmployeePresent(int p)
	{
		if(p == 1)
			return true;
		else
			return false;
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
		
	}

}
