package com.assignment;

import java.util.Scanner;

public class CharacterPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "Tops Technologies!";
		int search = sc.nextInt();
		
		System.out.println(input.charAt(search));
	}
}
