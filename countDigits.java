package com.assignment;

import java.util.Scanner;

public class countDigits {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int digits[] = {1,2,4,5,8,9,8,7,5};
		
		for(int i=0; i<digits.length; i++) {
			count++;
		}
		
		System.out.println(count);
	}
}
