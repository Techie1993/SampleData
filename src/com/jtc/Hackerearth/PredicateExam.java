package com.jtc.Hackerearth;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExam {

	public static void main(String[] args) {
		
		
		Predicate<Integer>isEven=num->num%2==0;
		
		System.out.println(isEven.test(24));
		
		System.out.println("Validating passwords\n");
		
		Predicate<String>Valid=pass->pass!=null
				
	&& pass.length()>=8
	&& pass.matches(".*[0-9].*")
	&& pass.matches(".*[A-Z].*")
	&& pass.matches(".*[!@#$%^&*()_].*");
	
	System.out.println(Valid.test("Akshay1993"));
	
	
	System.out.println("Validating PAN number");
	
	
	Predicate<String>PAN=pnum->pnum!=null
			&& pnum.matches("[0-9A-Z]{10}");
	
	System.out.println(PAN.test("ABCDE123"));
	
	
	System.out.println("Driving Licence\n");
	
	Predicate<String>License=num->num!=null
			&& num.matches("[A-Z0-9]{9}");
	
	
	
	System.out.println(License.test("MH40T2171"));
	
	
	System.out.println("Predicate Negate\n");
	
	
	Predicate<Integer>isOdd=isEven.negate();
	
	System.out.println(isOdd.test(10));
	System.out.println(isOdd.test(7));
	
	
	System.out.println("Bipredicate pass\n");
	
	BiPredicate<Integer,Integer>isGreater=(a,b)->a>b;
	
	System.out.println(isGreater.test(10,5));
	
	System.out.println("Credentials validation\n");
	
	String username="ABC";
	String pass="ABC123";
	
	BiPredicate<String,String>Validd=(a,b)->
	a.equals(username) && b.equals(pass);
	
	System.out.println(Validd.test("ABC","ABC123"));
	
	
	
	
	
	
	
	
		
		

	}
}
