package com.siddhi.arrays;

public class TestingEquality {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int arr1[] = { 1, 2, 3, 4, 6 };

		boolean equalOrNot = true;

		if (arr.length == arr1.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != arr1[i]) {
					equalOrNot = false;
				}
			}
		} else {
			equalOrNot = false;
		}

		if (equalOrNot) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not equal");
		}

		// System.out.println(Arrays.equals(arr, arr1));
	}

}
