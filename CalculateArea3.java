package com.assignment;

abstract class Shape_1{
	abstract float rectangleArea(float length, float breadth);
	abstract float squareArea(float length);
	abstract float circleRadius(float radius);
}

class Area extends Shape_1{

	@Override
	float rectangleArea(float length, float breadth) {
		float areaOfRectangle = length * breadth;
		System.out.println("The Area of rectangle is :-" + areaOfRectangle);
		return areaOfRectangle;
	}

	@Override
	float squareArea(float length) {
		float areaOfSquare = length * length;
		System.out.println("The Area of square is :- " + areaOfSquare);
		return areaOfSquare;
	}

	@Override
	float circleRadius(float radius) {
		float radiusOfCircle = radius / 2;
		System.out.println("The radius of circle is :-" + radiusOfCircle);
		return radiusOfCircle;	
	}
}



public class CalculateArea3 {
	public static void main(String[] args) {
		Shape_1 shapes = new Area();
		shapes.rectangleArea(25, 42);
		shapes.squareArea(25);
		shapes.circleRadius(35);
	}
}
