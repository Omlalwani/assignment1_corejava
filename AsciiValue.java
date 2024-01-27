package com.assignment;

import java.util.Scanner;

public class AsciiValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charcter to know the ASCII value :-" );
		char c = sc.next().charAt(0);
		
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println((int) c);
		}else {
			System.out.println("Error..");
		}
	}

}
