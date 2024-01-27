package com.assignment;

public class CompareString {
	public static void main(String[] args) {
		String checkString1 = "topsint.com";
		String checkString2 = "Topsint.com";
		
		if(checkString1.equals(checkString2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}