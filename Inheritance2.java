package com.assignment;

class Shape_2{
	public void print() {
		System.out.println("This is shape class...");
	}
}

class rectangle_2 extends Shape_2{
	public void print() {
		System.out.println("This is rectangle class...");
	}
}

class square_2 extends Shape_2{
	public void print() {
		System.out.println("This is square class...");
	}
}

class circle extends rectangle_2{
	public void print() {
		System.out.println("Circle of rectangle...");
	}
}





public class Inheritance2 {

	public static void main(String[] args) {
		
		Shape_2 s2 = new circle();
		s2.print();
		
		rectangle_2 s3 = new circle();
		s3.print();
		
		Shape_2 s4 = new rectangle_2();
		s4.print();
		

	}

}
