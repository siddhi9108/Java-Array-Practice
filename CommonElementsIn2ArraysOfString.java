package com.siddhi.arrays;

public class CommonElementsIn2ArraysOfString {

	public static void main(String[] args) {
		String[] arr = { "Siddhi", "Is", "The", "Best" };
		String[] arr1 = { "Her", "Father", "Be", "The", "Best" };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					System.out.println("Common Elements: " + arr[i]);
				}
			}
		}
	}

}
