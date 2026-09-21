package com.jtc.practice;




public class StringIntern {

	public static void main(String[] args) {
		

		String s1=new String("Java");      // Heap
		
		String s2="Java";   // SCP

		System.out.println(s1==s2);
		
		s1=s1.intern();    // it gives the reference of value from SCP.
		System.out.println(s1==s2);
		
		
		
		

	}
}
