package com.siddhi.arrays;

public class CommonElementsIn2ArraysOfIntegers {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 89 };
		int[] arr1 = { 23, 24, 49, 84, 26, 48, 35, 5,6 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					System.out.println("Common Element: " + arr[i]);
				}
			}
		}
	}

}
