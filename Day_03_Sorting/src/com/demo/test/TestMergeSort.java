package com.demo.test;

import java.util.Scanner;

import com.demo.sort.MergSortAlgorithm;

public class TestMergeSort {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr [] = new int[size];
		
		System.out.println("Enter the Array: ");
		MergSortAlgorithm.acceptData(arr);
		
		System.out.println("Your Array is: ");
		MergSortAlgorithm.displayArray(arr);
		
		MergSortAlgorithm.mergeSort(arr, 0, arr.length-1);
		System.out.println("After Sorting using merge sort algorithm sorted array is: ");
		MergSortAlgorithm.displayArray(arr);

	}

}
