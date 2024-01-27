package com.assignment;

class AgeNotValidException extends Exception{
	int age;
	
	public AgeNotValidException() {
		// TODO Auto-generated constructor stub
		this.age = age;
	}
}

class nameNotValidException extends Exception{
	String name;
	public nameNotValidException() {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
}

class Students{
	int rollNo, age;
	String name, course;
	
	public void setAgeData(int rollNo, int age, String course) throws AgeNotValidException {	
		
		if((age>=15 && age <=21)) {
			throw new AgeNotValidException();
		}else {
			System.out.println("Your roll No is :-" + rollNo);
			System.out.println("Your age is :- " + age);
			System.out.println("You have taken :- " + course);
		}
	}	
	
	
	public void setNameData(String name) throws nameNotValidException {
		char[] c = name.toCharArray();
		for(int i=0; i<c.length; i++) {
			if((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z')) {
				System.out.println("Your name is :- " + name);
			}else {
				throw new nameNotValidException();
			}
		}
		
	}
}

public class StudentCustomException {
	public static void main(String[] args) {
		Students yash = new Students();
		try {
			yash.setAgeData(1, 16, "BCA");
		} catch (AgeNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			yash.setNameData("Yash!");
		} catch (nameNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
