package com.jtc.practice;


class Numberss{
	
	public synchronized void EvenPrint() {
		
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	
	public synchronized void OddPrint() {
		
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}	
}


// Thread Class

class Digitss extends Thread{
	
	Numberss nums;

	public Digitss(Numberss nums) {
		super();
		this.nums = nums;
	}
	
	public void run() {
		nums.EvenPrint();
	}
}


class OddDigits extends Thread{
	Numberss nums;

	public OddDigits(Numberss nums) {
		super();
		this.nums = nums;
	}
	
	public void run() {
		nums.OddPrint();
	}
}

public class Synchronized {

	public static void main(String[] args) throws InterruptedException {
		
		Numberss N1=new Numberss();
		Thread T1=new Thread();
		T1.start();
		
		T1.join();
		
		Thread T2=new Thread();
		T2.start();
		
		
		
		
		
	}
}
