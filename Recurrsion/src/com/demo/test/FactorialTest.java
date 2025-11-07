package com.demo.test;

import java.util.Scanner;

import com.demo.recurssion.factorialRecurrsion;

public class FactorialTest {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" enter the number :");
		int num = sc.nextInt();
		
		int factorial = factorialRecurrsion.factorial(num);
		System.out.println("Factorial of "+num+" is: "+factorial);
		
		
		
		

	}

}
