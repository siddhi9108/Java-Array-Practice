package com.siddhi.arrays;

import java.util.Arrays;

public class RearangePositiveAndNegative {

	public static void main(String[] args) {
		int arr[] = { -4, 8, 6, -5, 6, -2, 1, 2, 3, -11 };
		System.out.println("Original array : " + Arrays.toString(arr));
		int temp;
		for (int i = 0; i < arr.length; i++) {
			while ((i > 0) && (arr[i] > 0) && (arr[i - 1] < 0)) {
				temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
				i--;
			}
		}
		System.out.println("New array : " + Arrays.toString(arr));
	}
}
