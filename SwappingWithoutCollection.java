package com.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingWithoutCollection {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(255);
		a1.add(295);
		a1.add(395);
		a1.add(440);
		a1.add(852);
		
		System.out.println("Before Swapping :- " + a1);
		swapElements(a1, 1, 4);
		System.out.println("After Swapping :- " + a1);
	}
	private static void swapElements(ArrayList<Integer> list,int index1,int index2) {
		if(index1 < 0 || index1 > list.size() || index2 < 0 || index2 > list.size() ) 
		{
			System.out.println("Invalid to swap elements...");
			return;
		}	
		int temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);
	}
}
