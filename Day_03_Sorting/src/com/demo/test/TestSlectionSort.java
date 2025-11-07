package com.demo.test;

import java.util.Scanner;

import com.demo.sort.SelectionSort;

public class TestSlectionSort {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the size of array : ");
		int size = sc.nextInt();
		int arr [] = new int[size];
		
		System.out.println(" Enter the Elements of Array : ");
		SelectionSort.AcceptArray(arr);
		
		System.out.println(" Display the Array : ");
		SelectionSort.displayArray(arr);
		
		SelectionSort.selectionSort(arr);
		System.out.println("after using selection sort our sorted Array is: ");
		SelectionSort.displayArray(arr);
		

	}

}
