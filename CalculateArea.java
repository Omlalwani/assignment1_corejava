package com.assignment;

class shape
{
	int length, breadth;
	public void square(int length)
	{
		int result = length * length;
		System.out.println("The area of square is :-" + result);
	}
	
	public void rectangle(int length, int breadth) 
	{
		int result = length * breadth;
		System.out.println("The area of rectangle is :- " + result);
	}
}


public class CalculateArea {
	public static void main(String[] args) {
		shape s1 = new shape();
		s1.square(55);
		s1.rectangle(20, 12);
	}
}
