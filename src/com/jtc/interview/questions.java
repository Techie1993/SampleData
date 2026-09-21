package com.jtc.interview;

import java.util.List;

public class questions {

	public static void main(String[] args) {
		
		
		String comp="Delloite";
		
	List<Character>vowels=comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)>=1).toList();
	
	System.out.println(vowels);
	
	System.out.println("Counting Consonents\n");
		
	List<Character>conso=comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)<=-1).toList();
		
	System.out.println(conso);
		
		
		
		

	}
}
