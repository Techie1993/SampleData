package com.jtc.practice;



interface Task{
	
	void start();
	void stop();
}


class Developer implements Task{

	public void start() {
		System.out.println("Task is started");
	}

	
	public void stop() {
		System.out.println("Task is stopped!");	
	}
}

public class IntExample {

	public static void main(String[] args) {
		
		Developer D1=new Developer();
		D1.start();
		
		
		
		
		
		
		
	}
}
