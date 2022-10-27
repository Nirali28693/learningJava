package com.ict.learning.learningJava;

import java.util.Scanner;

public class ReasDataFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter your fname : ");
//		String fname = scanner.nextLine();
//		System.out.println("enter your lname : ");
//		String lname = scanner.nextLine();
//		System.out.println("enter your age : ");
//		int age = scanner.nextInt();
//		
//
//		System.out.println("hello " + fname + " " + lname);
//		System.out.println("you are  " + age + " yr old");

	String name;
		System.out.println("enter your fname : ");
		name = scanner.nextLine();
		System.out.println("enter your middlename : ");
		name = name+" " +scanner.nextLine();
		System.out.println("enter your middlename : ");
		name = name+" " +scanner.nextLine();
	
		System.out.println("hello " + name + " " +" welcome");
	}

}
