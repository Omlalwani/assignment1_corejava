package com.assignment;

class Members{
	String name, address, tel;
	byte age;
	double salary;
	
	public void setData() {
		name = "Om Lalwani";
		age = 21;
		tel = "8160849113";
	}
	
	public void setGetSalary() {
		salary = 1200000.00;
		System.out.println("Salary is :- " + salary);
	}
	
	public void getData() {
		System.out.println("Name is :- " + name);
		System.out.println("Age is :- " + age);
		System.out.println("Phone number is :- "+ tel);
	}
}



public class SalaryOfMembers {

	public static void main(String[] args) {
		Members employee = new Members();
		employee.setData();
		employee.getData();
		employee.setGetSalary();

	}

}
