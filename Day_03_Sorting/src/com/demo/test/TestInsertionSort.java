package com.demo.test;

import java.util.Scanner;

import com.demo.sort.InsertionSortAlgorithm;

public class TestInsertionSort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter the size of array: ");
		int size = sc.nextInt();
		
		int arr []= new int [size];
		
		System.out.println("enter the array : ");
		InsertionSortAlgorithm.acceptArray(arr);
		
		System.out.println("enter the array : ");
		InsertionSortAlgorithm.displayArray(arr);
		
		

		InsertionSortAlgorithm.insertionSort(arr);
		System.out.println("After Sorting using insertion sort algorithm sorted array is: ");
		InsertionSortAlgorithm.displayArray(arr);


	}

}
