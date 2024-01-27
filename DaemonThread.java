package com.assignment;

class Daemon extends Thread{
	String name;
	public void setDaemon() {
		name = "Om Lalwani";
		System.out.println(name);
	}
}

class Daemon2 extends Thread{
	
}



public class DaemonThread {
	public static void main(String[] args) {
		Daemon t1 = new Daemon();
		Daemon t2 = new Daemon();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		
	}

}
