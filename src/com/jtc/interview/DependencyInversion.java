package com.jtc.interview;



interface Pay{
	
	void payment();	
}


class UPI implements Pay{

	@Override
	public void payment() {
		System.out.println("UPI Done!");
	}
}

class Credit implements Pay{

	@Override
	public void payment() {
		System.out.println("Credit Card paid");
		
	}	
}

public class DependencyInversion {

	public static void main(String[] args) {
		
		UPI upi=new UPI();
		upi.payment();
		
		
		
		
		
		
	}
}
