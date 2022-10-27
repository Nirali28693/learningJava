package com.ict.learning.learningJava;

import java.util.Scanner;

public class UnderstandingMethod {

/*	int fvalue = 20;
	int svalue = 10;

	public void addition() {
		int sum = fvalue + svalue;
		System.out.println("sum of two is : "+ sum);
	}

	public void subtraction() {
		int sub = fvalue-svalue;
		System.out.println("sub of two is : "+sub);
	}
	public void multyply() {
		int mul = fvalue*svalue;
		System.out.println("multyply of two is : "+mul);
	}
	public void division() {
		int div = fvalue/svalue;
		System.out.println("division is : "+div);
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		UnderstandingMethod umethod = new UnderstandingMethod();
		
		
		
		  umethod.addition(); umethod.subtraction(); umethod.multyply();
		  umethod.division();
		  */
		 	
	//****************************************************//
	/*
	 * int fvalue = 10; int svalue = 20;
	 * 
	 * public void addition(int fvalue, int svalue) { int sum = fvalue+svalue;
	 * System.out.println("sum of two " + sum); }
	 */
	int fvalue;
	int svalue;
	int sum;
	
	public  void additional(int fvalue, int svalue) {
	sum =  fvalue+ svalue;
	//return sum;
	System.out.println("sum : "+ sum);
	}
			
	public static void main(String[] args ) {
		UnderstandingMethod uMethod = new UnderstandingMethod();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a value of fvalue: ");
		int fvalue = scanner.nextInt();
	
		System.out.println("enter a value o\f svalue: ");
		int svalue = scanner.nextInt();
		
		uMethod.additional(fvalue,  svalue);
		
	
		
		
	
	}

}
