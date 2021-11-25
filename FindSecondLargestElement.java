package com.siddhi.arrays;

import java.util.Arrays;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		Arrays.sort(arr);
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[arr.length - 2]);
			System.out.println(arr[arr[0]]);
			break;
		}
	}

}
