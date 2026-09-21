package com.jtc.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Rotations {

	public static void main(String[] args) {
		
		int Data[]= {1,2,3,4,5};
		
		int k=1;
		int n=Data.length;
		
		int newarr[]=new int[Data.length];
		
		
		for(int i=0;i<=Data.length-1;i++) {
			newarr[(i+k)%n]=Data[i];
		}
		
		System.out.println(Arrays.toString(newarr));
		
		
		System.out.println("Shifitng all zero to obe side\n");
		
		int Digits[]= {2,3,0,5,0,6,0,7,8};
		
	int res[]=IntStream.concat(Arrays.stream(Digits).filter(e->e!=0), 
			Arrays.stream(Digits).filter(e->e==0)).toArray();
	
	System.out.println(Arrays.toString(res));
		
		
	}

}
