package com.assignment;

import java.util.Scanner;

public class CompareString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Starts with :- ");
		String checkString = sc.next();
		String s1 = "Red";
		
		if(s1.equals(checkString)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
