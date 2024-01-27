package com.assignment;

class First extends Thread{
	public void run() {
		int i=1;
		while(i <= 5) {
			System.out.println("First Thread :-" + i);
			i++;
		}
		System.out.println("First Completed");
	}
}



public class Thread1 {
	public static void main(String[] args) {
		First f1 = new First();
		f1.start();
		f1.start();
		
		int i = 1;
		while(i <= 5) {
			System.out.println("Main Thread :-" + i);
			i++;
		}
		System.out.println("Main Thread Completed....");
	}

}
