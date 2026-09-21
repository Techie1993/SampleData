package com.jtc.practice;


class Digits{
	
	
	public synchronized void ShowEven() throws InterruptedException {
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
	}
	
	public synchronized void ShowOdd() throws InterruptedException {
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
	}
}


class EvenNumbers extends Thread{
	
	Digits digi;

	public EvenNumbers(Digits digi) {
		super();
		this.digi = digi;
	}
	
	public void run() {
		try {
			digi.ShowEven();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class OddNumbers extends Thread{
	
	Digits odd;

	public OddNumbers(Digits odd) {
		super();
		this.odd = odd;
	}
	
	public void run() {
		try {
			odd.ShowOdd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}

public class MethodSync {

	public static void main(String[] args) {
	
		Digits D1=new Digits();
		
		EvenNumbers E1=new EvenNumbers(D1);
		
		OddNumbers O1=new OddNumbers(D1);
		
		E1.start();
		O1.start();
		
		
		
		
		
		
		

	}

}
