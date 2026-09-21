package com.jtc.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Operations {

	public static void main(String[] args) {
		
		int Data[]= {14,12,-2,15,-6,56,-8,14};
		
		
	int [] res=IntStream.concat(Arrays.stream(Data).filter(e->e>=0), 
			Arrays.stream(Data).filter(e->e<=0)).toArray();
	
	System.out.println(Arrays.toString(res));
		
		
		
		
		
		
		
		
		
		

	}
}
