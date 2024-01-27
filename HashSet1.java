package com.assignment;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(256);
		h1.add(257);
		h1.add(258);
		h1.add(259);
		
		System.out.println("Size is :- " + h1.size() );
		System.out.println("Value is :- " + h1);
		System.out.println();
		
		Iterator<Integer> i1 = h1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("Number of elements are :- " + h1.size());
	}
}