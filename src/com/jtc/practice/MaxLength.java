package com.jtc.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxLength {

	public static void main(String[] args) {
		
		
		String cars[]= {"Thar","Safari","Pajero","Harrier"};
		
		String Max=cars[0];
		
		for(int i=0;i<=cars.length-1;i++) {
			if(Max.length()<cars[i].length()) {
				Max=cars[i];
			}
		}
		
		System.out.println("Maximum is:"+Max);
		
		
		ArrayList<String>Org=new ArrayList<>();
		Org.add("KPMG");
		Org.add("KPMG");
		Org.add("Google");
		Org.add("JP Morgan");
		Org.add("Delloite");
		
	List<String>Duplicate=Org.stream()
			.filter(e->Collections.frequency(Org,e)>1).
			collect(Collectors.toList());
		
		
		System.out.println(Duplicate);
		
		
		
		

	}

}
