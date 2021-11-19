package com.siddhi.arrays;

import java.util.Arrays;

public class AvgValExceptLargestAndSmallestVal {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		int[] arr = new int[] { 20, 11, 21, 4, 55, 32, 44, 66, 1, 9 };
		Arrays.sort(arr);
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Largest Value: " + arr[i - 1]);
		System.out.println("Smallest Value: " + arr[0]);
		for (i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int totalSum = sum - (arr[i - 1] + arr[0]);
		float x = arr.length - 2;
		float avg = totalSum / x;
		System.out.println(avg);
	}

}
