package com.assignment;

import java.util.Scanner;

public class leapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year to check wheter it is leap year or not :- ");
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			System.out.println("Its a leap year...");
		}else {
			System.out.println("Not a leap year...");
		}
	}

}
