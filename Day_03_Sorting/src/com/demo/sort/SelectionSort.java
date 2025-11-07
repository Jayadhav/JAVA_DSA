package com.demo.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
{

	public static void AcceptArray(int[] arr) 
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0 ;i<arr.length;i++)
		{
			System.out.println("Enter " +i+ "elements");
			arr[i] = sc.nextInt();
		}
		
		
	}

	public static void displayArray(int[] arr)
	{
		for(int i=0 ; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println();
		
	}

	public static void selectionSort(int[] arr)
	{
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			int minpos = findMin(arr,i);
			int temp =arr[i];
			arr[i]=arr[minpos];
			arr[minpos]=temp;
			
			System.out.println("iteration " +i);
			System.out.println(Arrays.toString(arr));
			System.out.println("................................");
			
			
		}
		
		
	}

	private static int findMin(int[] arr, int start) 
	{
		int minpos = start;
		for(int i=start ; i<arr.length ; i++)
		{
			if(arr[i]<arr[minpos])
			{
				minpos = i;
			}
		}
		return minpos;
	}

	
	
	

}
