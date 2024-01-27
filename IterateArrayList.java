package com.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class IterateArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(256);
		a1.add(259);
		a1.add(260);
		
		
		for(int i=0; i< a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		a1.add(1, 257);
		System.out.println("Add at specified index :- " + a1);
		
		a1.remove(3);
		System.out.println("Remove an element :- " +a1);
		
		System.out.println(a1.get(1));
		
		a1.set(1, 258);
		System.out.println("Updated :- "  + a1);
		
		int target = 258;
		if(a1.contains(target)) {
			System.out.println("Found " + target);
		}else {
			System.out.println("Not Found...");
		}
		
		a1.add(1, 285);
		System.out.println(a1);
		
		Collections.sort(a1);
		System.out.println("Sorted array :- "+a1);
		
		System.out.println("New Array List..");
		
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.addAll(a1);
		System.out.println(a2);
		
		
		
	}

}
