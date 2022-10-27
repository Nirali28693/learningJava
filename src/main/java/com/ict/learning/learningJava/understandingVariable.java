package com.ict.learning.learningJava;

public class understandingVariable {

	public static void main(String[] args) {
	
String firstname = "nency";
String lastname = "robert";

	StringBuilder stringbuilder = new StringBuilder("hello");
	 System.out.println(stringbuilder.capacity());
	 System.out.println(stringbuilder.append(" world"));
	 stringbuilder.trimToSize();
	 System.out.println(stringbuilder.capacity());
	 
	 //********append, remove, replace, insert format methods ********

	 stringbuilder.append("\n");
	System.out.println(stringbuilder.append("  Good Morning "));
	
	 System.out.println(stringbuilder.insert( 6, " Globe, "));
	 System.out.println(stringbuilder.length());
	 
	System.out.println(stringbuilder.replace(7,13,"beautiful"));
	 String a = "aabbccddaabbccdd";//(not a stringbuilder method)
	 System.out.println(a.replace("bb","**" ));
	 
	 System.out.println(stringbuilder.deleteCharAt(0));
	 
	 System.out.println(stringbuilder.delete(0,5));
	 
	 System.out.println(stringbuilder.reverse());
	//System.out.println(stringbuilder.remove( 7, 16,));
		
	
	}

}
