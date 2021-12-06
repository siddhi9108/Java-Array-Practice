package com.siddhi.arrays;

import java.util.Arrays;

public class Segregate0sAnd1s {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0 };
		System.out.println("Your Array: " + Arrays.toString(arr));

		int left = 0, right = arr.length - 1;
		while (left < right) {
			while (arr[left] == 0 && left < right) {
				left++;
			}
			while (arr[right] == 1 && left < right) {
				right--;
			}
			if (left < right) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
		System.out.println("Final Array: " + Arrays.toString(arr));
	}

}
