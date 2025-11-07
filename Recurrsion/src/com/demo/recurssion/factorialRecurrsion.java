package com.demo.recurssion;

public class factorialRecurrsion
{



	public static int factorial(int num)
	{
		if(num == 1)
		{
			return 1;
		}
		else
		{
			return (num * factorial(num-1));
		}
	
	}
	
	

}
