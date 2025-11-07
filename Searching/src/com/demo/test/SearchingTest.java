package com.demo.test;

import com.demo.seach.SearchingService;

public class SearchingTest {

	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,50,60,70};
		
		int pos = SearchingService.sequestialSeach(arr,20);
		System.out.println("found at "+ pos +" position ");
		
		int idx = SearchingService.binarySearch(arr, 50);
		System.out.println("found at "+idx+" position");
		
		int idx1 = SearchingService.binarySearchRecurssive(arr, 40, 0, 6);
		System.out.println("found at "+idx1+" position");
		
	}

}
