package com.jtc.practice;



class MyThreads extends Thread{
	
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}


public class ThreadCreate {

	public static void main(String[] args) {
		MyThreads M1=new MyThreads();
		M1.start();

	}
}
