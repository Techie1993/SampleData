package com.jtc.practice;

import java.util.Arrays;

public class remarr {

	public static void main(String[] args) {
		
		
		int Data[]= {14,22,31,32,33};
		int tar=22;
		
		int newarr[]=new int[Data.length-1];
		int j=0;
		
		
		for(int i=0;i<=Data.length-1;i++) {
			if(Data[i]!=tar) {
				newarr[j]=Data[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(newarr));
		

	}
}
