package com.siddhi.arrays;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {
		String[] arr = { "Siddhi", "Amilkathwar", "is", "is", "a", "a" };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println("Duplicate: " + arr[j]);
				}
			}
		}

	}

}
