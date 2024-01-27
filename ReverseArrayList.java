package com.assignment;

import java.util.ArrayList;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(255);
		a1.add(256);
		a1.add(257);
		a1.add(258);
		a1.add(259);
		a1.add(260);
		System.out.println("Values are :- " + a1);
		System.out.println("Size is :- " + a1.size());
		System.out.println("Reverse array list is :- ");
		for(int i=a1.size()-1; i>=0; i--) {
			System.out.print(a1.get(i) +  " ");
		}	
	}
}
