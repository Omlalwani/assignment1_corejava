package com.assignment;

import java.util.Scanner;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			arr[0]= 55;
			arr[1]= 56;
			arr[2]= 57;
			arr[3]= 58;
			arr[4]= 59;
			arr[5]= 60;
			
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number 1 :-");
			int a = sc.nextInt();
			
			System.out.println("Enter number 2 :-");
			int b = sc.nextInt();
			
			int c = a/b;
			System.out.println("Division is :- " + c);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
	
		} 
	}

}
