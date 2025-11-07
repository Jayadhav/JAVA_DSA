package com.demo.test;

import java.util.Scanner;

import com.demo.sort.QuickSortAlgorithm;

public class TestQuickSort {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the Size of the array : ");
		int size = sc.nextInt();
		
		int arr [] = new int [size];
		
		System.out.println("enter the Array : ");
		QuickSortAlgorithm.acceptArray(arr);
		
		System.out.println("Display your array is : ");
		QuickSortAlgorithm.displayArray(arr);
		
		
		QuickSortAlgorithm.quickSort(arr,0,arr.length-1);
		System.out.println("after sorting Quick sort Algorithm our sorted array is : ");
		QuickSortAlgorithm.displayArray(arr);
		
	}

}
