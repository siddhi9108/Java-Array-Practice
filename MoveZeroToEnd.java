package com.siddhi.arrays;

import java.util.Arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 0, 3, 0, 5, 0, 6 };
		int index = 0;
		for (int i : arr) {
			if (i != 0) {
				arr[index++] = i;
			}
		}
		for (int i = index; i < arr.length; i++) {
			arr[i] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}

}
