package com.assignment;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no1 :-");
			int a = sc.nextInt();
			
			System.out.println("Enter no2 :-");
			int b = sc.nextInt();
			
			int c = a / b;
			System.out.println("Division is :-" + c);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
