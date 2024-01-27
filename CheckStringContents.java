package com.assignment;

import java.util.Scanner;

public class CheckStringContents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String checkContent1 = "Java Exercise";
		String checkContent2 = "Java Exercise";
		
		
		
		if((checkContent1.length()-1 & checkContent1.length()-2) == (checkContent2.length()-1 & checkContent2.length()-2) ) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
	}
}