package com.assignment;
import java.util.Scanner;


public class GradingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks :-");
		int marks = sc.nextInt();
		
		if(marks >= 91) {
			System.out.println("A Grade");
		}else if(marks >=81 && marks<=90) {
			System.out.println("B Grade");
		}else if(marks>=61 && marks<=80) {
			System.out.println("C Grade");
		}else if(marks>=41 && marks<=60) {
			System.out.println("D Grade");
		}else {
			System.out.println("Fail..");
		}
	}
}