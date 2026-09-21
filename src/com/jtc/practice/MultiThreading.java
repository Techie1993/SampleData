package com.jtc.practice;


class Numbss{
	
	
	public synchronized void Even() throws InterruptedException {
		for(int i=0;i<=10;i++) {
			
			if(i%2==0) {
				System.out.println(i);
				Thread.sleep(1000);
			 }
		
		   }
		}
	
	public synchronized void Odd() throws InterruptedException {
		for(int i=0;i<=10;i++) {
			
			if(i%2!=0) {
				System.out.println(i);
				Thread.sleep(1000);
			 }
		
		   }
		}
	}



class MyThread extends Thread{
	
	Numbss num;

	public MyThread(Numbss num) {
		super();
		this.num = num;
	}
	
	
	public void run() {
		try {
			num.Even();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}



class OddThread extends Thread{
	
	Numbss nums;

	public OddThread(Numbss nums) {
		super();
		this.nums = nums;
	}
	
	public void run() {
		try {
			nums.Odd();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		
		Numbss N1=new Numbss();
		
		
		MyThread T1=new MyThread(N1);
		T1.start();
		T1.join();
		
		OddThread T2=new OddThread(N1);
		T2.start();
		
		
		
		
		
		
		
		
		
		
	}
}
