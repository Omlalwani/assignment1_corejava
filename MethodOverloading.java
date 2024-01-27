package com.assignment;

class overloadingMethods
{
	public void setData(int n, char c) {
		System.out.println("Method 1 Integer is :-" + n);
		System.out.println("Method 2 Character is :-" + c);
	}
	
	public void setData2(char c, int n) {
		System.out.println("Method 2 Character is :- " + c);
		System.out.println("Method 2 Integer is :-" + n);
	}
}


public class MethodOverloading {
	public static void main(String[] args) {
		overloadingMethods o1 = new overloadingMethods();
		o1.setData(587, 'O');
		o1.setData2('M', 3108);
	}

}
