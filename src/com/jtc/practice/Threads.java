package com.jtc.practice;


class Numbers extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}	
}

public class Threads {

	public static void main(String[] args) {
		
		
		Numbers N1=new Numbers();
		N1.start();
		
		
		
		
		
		
		
	}
}
