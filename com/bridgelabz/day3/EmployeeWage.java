package com.bridgelabz.day3;

import java.util.Random;

public class EmployeeWage {

	public boolean isEmployeePresent(int p)
	{
		if(p == 1 || p == 2)
			return true;
		else
			return false;
	}
	
	public int calculateWage(int p)
	{
		int wage = 0;
		if(isEmployeePresent(p))
		{
			if(p == 2)
				wage = 20*4;
			else
				wage = 20*8;
		}
		else
			wage = 20*0;
			
		return wage;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to employee wage computaion program!");
		Random rnd = new Random();
		int p = rnd.nextInt(3);
		EmployeeWage emp = new EmployeeWage();
//		if(emp.isEmployeePresent(p))
//			System.out.println("Employee is present!");
//		else
//			System.out.println("Employee is absent!");
//		
//		if(p == 2)
//			System.out.println("Employee is part time");
//		else
//			System.out.println("Employee is full time");
//		
//		int wage = emp.calculateWage(p);
//		System.out.println("Employee wage is " + wage);
		
		switch(p)
		{
		case 0: System.out.println("Employee is absent");
		  		System.out.println("Employee wage is " + emp.calculateWage(0));
		  		break;
		case 1: System.out.println("Employee is present full time");
  				System.out.println("Employee wage is " + emp.calculateWage(1));
  				break;
		case 2:System.out.println("Employee is present part time");
  				System.out.println("Employee wage is " + emp.calculateWage(2));
  				break;
  		default:break;
		}
		
	}

}
