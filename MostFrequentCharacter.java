package com.assignment;

public class MostFrequentCharacter {
	final static int ascii = 256; 
	public static void main(String[] args) {
		String str = "successes";
		System.out.println("Max occuring character is :- " + getMaxOccuringChar(str));
		
	}
	
	static char getMaxOccuringChar(String str) {
		// Create array to keep count of individual characters and initialize it with 0
		int count[] = new int[ascii];
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		int max = -1;
		char result = ' ';
		
		//Traversing through the string and maintaining the count of each character.		
		for(int i=0; i<str.length(); i++) {
			if(max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		
		return result;
	}
}
