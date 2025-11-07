package com.demo.sort;

import java.util.Scanner;

public class MergSortAlgorithm {

	public static void acceptData(int[] arr)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<arr.length ;i++)
		{
			System.out.println(" ENter "+i +"elements");
			arr[i] = sc.nextInt();
			
		}
		
	}

	public static void displayArray(int[] arr) 
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

	public static void mergeSort(int[] arr, int start, int end)
	{
		if(start<end)
		{
			int mid = (start + end) /2;
			//right treee
			mergeSort(arr,start,mid);
			//right tree
			mergeSort(arr,mid+1, end);
			//merge to array
			merge(arr, start, mid, end);
		}
		
	}

	private static void merge(int[] arr, int start, int mid, int end)
	{
		//length of left array
		int n1 =mid-start+1;
		
		//length of right array
		int n2 = end-mid;
		
		int [] leftarray = new int [n1];
		int [] rightarray = new int[n2];
		
		//copy arrays
		for(int i=0 ; i<leftarray.length ; i++)
		{
			leftarray[i]=arr[start+i];
		}
		
		for(int i=0; i<rightarray.length ; i++)
		{
			rightarray[i]=arr[mid+i+1];
		}
		
		int i=0;
		int j=0;
		int k=start;
		
		while(i<leftarray.length && j<rightarray.length)
		{
			if(leftarray[i] < rightarray[j])
			{
				arr[k]=leftarray[i];
				i++;
				k++;
			}
		
			else
			{
				arr[k]=rightarray[j];
				j++;
				k++;
			}
		}
		
		while(i<leftarray.length)
		{
			arr[k]=leftarray[i];
			i++;
			k++;
		}
		while(j<rightarray.length)
		{
		arr[k]=rightarray[j];
		j++;
		k++;
										
		}
	}

	
	

	
}
