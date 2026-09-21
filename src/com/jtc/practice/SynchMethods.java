package com.jtc.practice;


// Shared source

class Numbs{
	
	public synchronized void EvenShow() throws InterruptedException {
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			
		}
	}
	
	public synchronized void OddShow() throws InterruptedException {
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		
		
	}	
}


// Thread class

class EvenData extends Thread{
	
	Numbs show;
	
	
	public EvenData(Numbs show) {
		super();
		this.show = show;
	}


	public void run() {
		try {
			show.EvenShow();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}


class OddData extends Thread{
	
	Numbs odd;
	
	public OddData(Numbs odd) {
		super();
		this.odd = odd;
	}

	public void run() {
		try {
			odd.OddShow();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class SynchMethods {

	public static void main(String[] args) throws InterruptedException {
		
		Numbs obj=new Numbs();
		
		
		EvenData E1=new EvenData(obj);
		OddData O1=new OddData(obj);
		
		
		E1.start();
		
		E1.join();
		
		O1.start();
		
		
		
		
		
		
		
		
		

	}
}
