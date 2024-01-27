package com.assignment;

class Second implements Runnable{

	@Override
	public void run() {
		int i = 1;
		while(i <= 5) {
			System.out.println("Runnable thread :- " + i);
			i++;
		}		
		System.out.println("Runnable complted...");
	}	
}


public class RunnableInterface1 {
	public static void main(String[] args) {
		Second s1 = new Second();
		Thread t1 = new Thread(s1);
		t1.start();
		
		
		int i = 1;
		while(i <= 5) {
			System.out.println("Main Thread :-" + i);
			i++;
		}
		System.out.println("Main Completed..");
	}

}
