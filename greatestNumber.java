package com.assignment;

import java.util.Scanner;

public class greatestNumber {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number A :-");
		int a = sc.nextInt();
		
		System.out.print("Enter number B :-");
		int b = sc.nextInt();
		
		System.out.print("Enter number C :-");
		int c = sc.nextInt();
		
		
		if(a>b && a>c) {
			System.out.println(a + " is greator...");
		}
		else if(b>a && b>c){
			System.out.println(b + " is greator...");
		}
		else {
			System.out.println(c + " is greator...");
		}
	}
}
