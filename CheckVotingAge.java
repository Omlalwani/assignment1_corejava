package com.assignment;

class Vote extends Exception{
	int age;
	public void checkAge(int age) {
		if(age > 18) {
			System.out.println("You are eligible for vote");
		}else {
			throw new ArithmeticException("not valid");
		}
	}
}
public class CheckVotingAge {
	public static void main(String[] args) {
		Vote ageCheck = new Vote();
		ageCheck.checkAge(16);
	}

}
