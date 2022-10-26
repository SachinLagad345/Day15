package com.bridgelabz.day6;

import java.util.Scanner;

public class DayOfWeek {
	
	static int dayOfWeek(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		System.out.println("y0 is " + y0);
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		System.out.println("x is " + x);
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		System.out.println("m0 is " + m0);
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d, m, y;
		String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		Scanner s = new Scanner(System.in);
		System.out.println("enter date in day month year");
		d = s.nextInt();
		m = s.nextInt();
		y = s.nextInt();
		System.out.println("day is "+ days[dayOfWeek(d, m, y)]);
		s.close();
	}

}
