package com.assignment;


class PrintNumber{
	int a;
	public void printn(int a) {
		System.out.println("Integer is :- " + a);
	}
	
	public void printn(float a) {
		System.out.println("Float is :- " + a);
	}
	
	public void printn(double a) {
		System.out.println("Double is :-" + a );
	}
}

public class DifferentDataTypes 
{
	public static void main(String[] args) {
		PrintNumber p1 = new PrintNumber();
		p1.printn(55);
		p1.printn(55.88f);
		p1.printn(22.889);
		
	}
}
