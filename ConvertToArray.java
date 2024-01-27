package com.assignment;

import java.util.Collections;
import java.util.HashSet;

public class ConvertToArray {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(255);
		h1.add(155);
		h1.add(899);
		
		System.out.println("Before Array :- " + h1);
		System.out.println("After array :- " + h1);
		
		Integer arr[] = new Integer[h1.size()];
		h1.toArray(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i);
		}
	}
}
