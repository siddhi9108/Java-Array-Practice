package com.siddhi.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupesFromArray {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5, 6, 3 };
		// int x = arr.length;
		// for (int i = 0; i < arr.length - 1; i++) {
		// for (int j = i + 1; j < arr.length - 1; j++) {
		// if (arr[i] == arr[j]) {
		// arr = ArrayUtils.remove(arr, j);
		// arr[j] = arr[j + 1];
		// }
		// }
		// }
		List<Integer> l = Arrays.asList(arr).stream().distinct().collect(Collectors.toList());
		System.out.println();
		System.out.println("Array after deletion: ");
		for (int i = 0; i < arr.length - 1;) {
			System.out.println(l);
			break;
		}
	

	}

}
