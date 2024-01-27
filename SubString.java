package com.assignment;

import java.util.ArrayList;

public class SubString {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Red");
		a1.add("Black");
		a1.add("Yellow");
		a1.add("Orange");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Red");
		a2.add("Black");
		a2.add("Yellow");
		a2.add("Orange");
		
		
		
		System.out.println(a1);
		System.out.println("Sub List is :- " + a1.subList(0, 2));
		System.out.println();
		
		System.out.println("Compareing two arraylist...");
		
		if(a1.containsAll(a2)){
			System.out.println("Same Elements");
		}else {
			System.out.println("Not same");
		}
	}
}
