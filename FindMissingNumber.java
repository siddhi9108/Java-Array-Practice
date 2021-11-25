package com.siddhi.arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8 };
		int n = arr.length + 1;
		int expectedSum = n * ((n + 1) / 2);
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		int missingNum = expectedSum - sum;
		System.out.println("Missing: " + missingNum);
	}

}
