package com.jtc.practice;

@FunctionalInterface
interface Calculation{
	
	void Show(int[]Data);
}

@FunctionalInterface
interface Companies{
	
	void ShowOrg(String[] Org);
}

public class LambdaExp {

	public static void main(String[] args) {
		
		
		int Digits[]= {10,14,21,32,24};
		
		Calculation C1=(data)->{
			
			for(int i=0;i<=data.length-1;i++) {
				if(data[i]%2==0) {
					System.out.println(data[i]);
				}
			}
		};
		C1.Show(Digits);
		
		System.out.println("Companies\n");
		
		String Organization[]= {"Delloite","Cybage","Cogzi","Accenture"};
		
		Companies C2=(comp)->{
			
			for(int i=0;i<=comp.length-1;i++) {
				if(comp[i].startsWith("C")) {
					System.out.println(comp[i]);
				}
			}	
		};
		
		C2.ShowOrg(Organization);
		
	}
}
