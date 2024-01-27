package com.assignment;

import java.util.Scanner;

public class countSpacesLetters {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String countLetters = "Hello World&123 ";
		char[] c = countLetters.toCharArray();
		
		
		int letters = 0;
		int numbers = 0;
		int spaces = 0;
		int specialCharacters = 0;
		
		
		for(int i=0; i<c.length; i++) {
			if((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z')) {
				letters++;
			}
			else if(Character.isDigit(c[i]))
			{
				numbers++;
			}
			else if(c[i] == 32) {
				spaces++;
			}else {
				specialCharacters++;
			}
		}
		
		System.out.println("Letters are :- " + letters);
		System.out.println("Numbers are :- " + numbers);
		System.out.println("Spaces are :- " + spaces);
		System.out.println("Special Characters are :- " + specialCharacters);
		
		sc.close();
	}
}
