package com.jtc.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class second {

	public static void main(String[] args) {
		
		
		List<Integer>Data=Arrays.asList(2);
		
		List<Integer> sec=Data.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		
		System.out.println(sec);
		
		
		//select max(esal) as sec_high from emptable where esal<(select max(esal) from emptable);
		
		String words="Accenture is good";

		String max=Arrays.stream(words.split(" "))
				.max(Comparator.comparing(String::length)).get();
		
		System.out.println(max);
		
		
		
		
		
		

	}
}
