package com.demo.test;

import java.util.Scanner;

import com.demo.sort.BubbleSort;

public class TestBubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		
		int arr [] = new int [size];
		
		System.out.println("Enter the Array : ");
		BubbleSort.acceptArray(arr);
		
		System.out.println("Display the Array : ");
		BubbleSort.displayArray(arr);
//		
//		BubbleSort.bubbleSort(arr);
//		System.out.println("After Sorting using bubble sort algorithm sorted array is:" );
//		BubbleSort.displayArray(arr);
		
//		BubbleSort.bubbleSortImproved(arr);
//		System.out.println("After Sorting using bubble sort Improved algorithm sorted array is: ");
//		BubbleSort.displayArray(arr);
//		
		
		BubbleSort.bubbleSortDecending(arr);
		System.out.println("After Sorting using bubble sort algorithm sorted array is decending order :" );
		BubbleSort.displayArray(arr);
		
	}

}
