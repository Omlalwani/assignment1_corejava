package com.assignment;

abstract class Bank
{
	String bankBalance;
	public void setData() {};
	
	public void display() {
		System.out.println(bankBalance);
	}
}


class Rio extends Bank{
	public void setData() {
		bankBalance = "Rio has $100";
	}
}

class Tokyo extends Bank{
	public void setData() {
		bankBalance = "Tokyo has $200";
	}
}


class Nairobi extends Bank{
	public void setData() {
		bankBalance = "Nairobi has $300";
	}
}



public class AbstractBank {
	public static void main(String[] args) {
		Bank brazil = new Rio();
		brazil.setData();
		brazil.display();
		
		Bank japan = new Tokyo();
		japan.setData();
		japan.display();
		
		Bank africa = new Nairobi();
		africa.setData();
		africa.display();
	}

}
