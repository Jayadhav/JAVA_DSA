package com.demo.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort
{

	public static void acceptArray(int[] arr)
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<arr.length ; i++)
		{
			System.out.println( " Enter " + i +" Element " );
			arr[i]=sc.nextInt();
		}
	}

	public static void displayArray(int[] arr)
	{
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	
	
	// bubble Sort normal method
	public static void bubbleSort(int[] arr) 
	{
		
		for(int i=0; i<arr.length; i++)
		{
			int swap = 0;
			for(int j=1; j<arr.length-i; j++)
			{
				if(arr[j-1] > arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swap++;
				}
			}
			
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
			System.out.println("Swapped "+swap+" times");
			System.out.println("----------------------------------");
		}
		
	}

	
	

	
	
	//BUBBLE SORT iMPROVED: 
	public static void bubbleSortImproved(int[] arr) 
	{
		
		for(int i=0; i<arr.length; i++)
		{
			boolean flag = false;
			int swap=0;
			for(int j=1; j<arr.length-i; j++)
			{
				if(arr[j-1] > arr[j])
				{
					int temp =arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					swap++;
							
				}
			}
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
			System.out.println("Swapped "+swap+" times");
			System.out.println("----------------------------------");
			
			if(!flag)
			{
				break;
			}
		}
		
	}

	public static void bubbleSortDecending(int[] arr)
	{
		
		for(int i=0; i< arr.length; i++) 
		{
			int swap = 0;
			for(int j=1; j<arr.length-i; j++)
			{
				if (arr [j-1]<arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swap++;
				}
			}
			System.out.println(" Iteration " + i);
			System.out.println(Arrays.toString(arr));
			System.out.println("Swapped "+swap+" times");
			System.out.println("----------------------------------");
		}
	
	}
	
}