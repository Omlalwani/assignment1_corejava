package com.assignment;

class Triangle{
	int length, base;
	public void setArea(int length, int base) {
		int area = (length * base)/2;
		System.out.println("The area of triangle is :-" + area);
	}
}


public class CalculateAreaTriangle {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.setArea(25, 30);	
	}
}