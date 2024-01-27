package com.assignment;

abstract class parent{
	 String message;
	 public void setData() {};
	 
	 public void show() {
		 System.out.println("Parent method called..");
		 System.out.println(message);
	 }
}

class child extends parent{
	public void setData() {
		message = "This is first subclass";
	}
	
	public void display() {
		System.out.println(message);
	}
}

class child1 extends parent{
	public void setData() {
		message = "This is second subclass";
	}
}



public class Abstract1 {
	public static void main(String[] args) {
		parent p1 = new child();
		p1.setData();
		p1.show();
		parent p2 = new child1();		
		p2.setData();
		p2.show();
	}

}
