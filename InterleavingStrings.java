package com.assignment;

public class InterleavingStrings 
{
	public static void main(String[] args) {
		String s1 = "WX";
		String s2 = "YZ";
		
		findInterLeaving(s1, 0, s2, 0, " ");
	}
	private static void findInterLeaving(String s1, int a, String s2, int b, String space) {
		if(a == s1.length() && b == s2.length()) {
			System.out.println(space);
		}
		if(a < s1.length()) {
			findInterLeaving(s1, a + 1, s2, b, space + s1.charAt(a));
		}
		if(b < s2.length()) {
			findInterLeaving(s1, a, s2, b+1, space + s2.charAt(b));
		}
	}
}