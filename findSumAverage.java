package com.assignment;

import java.util.Scanner;

public class findSumAverage {
	public static void main(String[] args) {
		
		int sum = 0;
		int average = 0;
		
		for(int i=1; i<=5; i++) {
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				
				sum += a;
				average = sum/5;
		}
		
		System.out.println("Sum is :- " +sum);
		System.out.println("Average is :- " + average);
	}

}
