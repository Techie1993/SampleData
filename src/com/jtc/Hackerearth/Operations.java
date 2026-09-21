package com.jtc.Hackerearth;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Operations {

	public static void main(String[] args) {
		
		
		int Data[]= {15,0,14,0,21,0,25};
		
		int result[]=IntStream.concat(Arrays.stream(Data).filter(e->e==0), 
				Arrays.stream(Data).filter(e->e!=0)).toArray();
		
		System.out.println(Arrays.toString(result));
		
		
		System.out.println("Seperating all negatives\n");
		

		int Digits[]= {15,-9,14,-4,21,-2,25};
		
		int Out[]=IntStream.concat(Arrays.stream(Digits).filter(e->e>0), 
				Arrays.stream(Digits).filter(e->e<0)).toArray();
		
		System.out.println(Arrays.toString(Out));
		
		System.out.println("Array Rotation\n");
		
		int Number[]= {1,4,8,9,5};
		int n=Number.length;
		int k=2;
		int newarr[]=new int[Number.length];
		
		
		for(int i=0;i<=Number.length-1;i++) {
			newarr[(i+k)%n]=Number[i];
		}
		
		System.out.println(Arrays.toString(newarr));
		
		
		
		

	}
}
