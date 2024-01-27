package com.assignment;

abstract class Marks{
	int c, java, dsa, computerNetworks;
	abstract float getPercentage();	
}

class Student_1 extends Marks{
	@Override
	float getPercentage() {
		c = 88;
		java = 87;
		dsa = 85;
		
		float total = c + java + dsa;
		float percentage = total / 3;
		
		System.out.println("Percentage is :- " + Math.round(percentage * 100)/100.00);
		return percentage;
	}
}

class Student_2 extends Marks{

	@Override
	float getPercentage() {
		c = 91;
		java = 61;
		dsa = 74;
		computerNetworks = 55;
		
		float total = c + java + dsa + computerNetworks;
		float percentage = total / 4;
		
		System.out.println("Percentage of student2 :-" + percentage);
		
		return percentage;
	}
}

public class CalculatePercentage {
	public static void main(String[] args) {
		Marks m1 = new Student_1();
		m1.getPercentage();
		
		Marks m2 = new Student_2();
		m2.getPercentage();
				
	}
}