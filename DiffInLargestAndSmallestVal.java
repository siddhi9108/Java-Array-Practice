package com.siddhi.arrays;

import java.util.Arrays;

public class DiffInLargestAndSmallestVal {

	public static void main(String[] args) {
		int i;
		int[] arr = new int[] { 20, 11, 21, 4, 55, 32, 44, 66, 1, 9 };
		Arrays.sort(arr);
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Largest Value: " + arr[i - 1]);
		System.out.println("Smallest Value: " + arr[0]);
		int diff = arr[i - 1] - arr[0];
		System.out.println("Difference between the largest and smallest values: " + diff);
	}

}
