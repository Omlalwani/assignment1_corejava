package com.assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertToArraylist {
	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<>();
		h1.add("Titanic");
		h1.add("12th Fail");
		h1.add("Mismatched");
		h1.add("Animal");
		
		System.out.println("HashSet :- " + h1);
		
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.addAll(h1);
		System.out.println("ArrayList :- " + a1);
	}

}
