package com.assignment;

class Parent1{
	public void showText() {
		System.out.println("This is parent class");
	}
}

class child_1 extends Parent1{
	public void showText() {
		System.out.println("This is child class");
	}
}

class Child2 extends Parent1{
	public void showText() {
		System.out.println("This is child 2 class");
	}
}




public class Inheritance1 {
	public static void main(String[] args) {
		Parent1 p1 = new Parent1();
		p1.showText();
		
		child_1 c1 = new child_1();
		c1.showText();
		
		Parent1 cp1 = new Child2();
		cp1.showText();		
	}

}
