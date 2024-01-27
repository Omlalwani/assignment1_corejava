package com.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Swapping {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(855);
		a1.add(955);
		
		System.out.println("Before Swapping :- " + a1);
		
		Collections.swap(a1, 1, 0);
		
		System.out.println("After Swapping :- " + a1);
	}

}
