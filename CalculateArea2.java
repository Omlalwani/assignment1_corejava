package com.assignment;

class Rectangle{
	int length, breadth;
	public void setArea(int length1,int breadth) {
		int length = length1 * breadth;
		System.out.println("The area of rectangle is :- " + length);
	}
	
	public void setPerimeter(int length,int breadth) {
		int perimeter = (length+breadth)* 2;
		System.out.println("The perimeter of the rectangle is :- " + perimeter);
	}
}


class Square extends Rectangle{
	int length = 25;
	public void setArea(int length1) {
		int length = length1 * length1;
		System.out.println("The area of the square is :- " + length);
	}
	
}

public class CalculateArea2 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setArea(25, 30);
		r1.setPerimeter(25, 30);
		
		Square s1 = new Square();
		s1.setArea(25);
	}

}
