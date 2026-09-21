package com.jtc.practice;


class MyTask implements Runnable{

	public void run() {
		System.out.println("Task is running!");
	}
}

public class RunnableInt {

	public static void main(String[] args) {
		MyTask task=new MyTask();
		
		Thread T1=new Thread(task);
		T1.start();
		

	}
}
