package com.jtc.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumElement {

	public static void main(String[] args) {
		
		
		int Data[]= {2,3,4,5,6,1};
		
		int tar=6;
		
		
		for(int i=0;i<=Data.length-1;i++) {
			for(int k=i+1;k<=Data.length-1;k++) {
				if(Data[i]+Data[k]==tar) {
					System.out.println(Data[i]+"-"+Data[k]);
				}
			}
		}
		
				
		System.out.println("Sec Highest\n");
		
	ArrayList<Integer>Result=Arrays.stream(Data).boxed().collect(Collectors.toCollection(ArrayList::new));
	
	
	Optional<Integer> sec=Result.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst();
	System.out.println(sec);
		
			
	}
}
