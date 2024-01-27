package com.assignment;

public class AcceptInteger {
	public static void main(String[] args) {
//		int n=5;
//		for(int i=1; i<=3; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(n);
//			}
//			System.out.print("+");
//		}
		
		
		int n=5;
		int result = 0;
		for(int i=1; i<=3; i++) {
			int value = 0;
			for(int j=1; j<=i; j++) {
				value = value * 10 + n;  // 0*10 + 5 = 0+5 = 5 , 5*10 + 5 = 50+5 = 55, 55*10+5 = 550+5 = 555
			}
			System.out.print(value);
			
			result += value;
			
			if(i<3) {
				System.out.print("+");
			}
		}
		
		System.out.println(" = " + result);
	}
}