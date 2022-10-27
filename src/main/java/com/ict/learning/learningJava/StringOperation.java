package com.ict.learning.learningJava;

import org.apache.commons.lang.WordUtils;

public class StringOperation {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
String description = "A movie or film is a type of visual art that uses videos and sounds to tell stories or teach people something. Most people watch movies to entertain themselves or to have fun. Some movies can make people laugh, but other movies can make them cry, or make them feel afraid .";
System.out.println(description);
description = WordUtils.capitalize(description);
System.out.println(description);
description = WordUtils.uncapitalize(description);
System.out.println(description);
System.out.println(description.length());
System.out.println (description.replaceAll("[a-zA-Z]+", "" ).length());
System.out.println (description.replaceAll("[a-zA-Z]+", "" ).replaceAll(" ", ""));
//System.out.println(description);
System.out.println (description.replaceAll("[a-zA-Z]+", "" ).replaceAll(" ", "").length());
//System.out.println(description.length());







	
	}

}
