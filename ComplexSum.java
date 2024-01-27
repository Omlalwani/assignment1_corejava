package com.assignment;

import java.util.Scanner;

class Complex{
	
	public void sum(int a, int b) {
		int sum = a + b;
		System.out.println("The Sum is :- " + sum);
	}
	
	public void difference(int a, int b) {
		int Difference = a - b;
		System.out.println("The difference is :- " + Difference);
	}
	
	public void product(int a, int b) {
		int Product = a * b;
		System.out.println("The product is :- " + Product);
	}
}


public class ComplexSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Complex c1 = new Complex();
		c1.sum(x,y);
		c1.difference(x,y);
		c1.product(x,y);
				
		
	}

}
