package com.siddhi.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Segregate0sAnd1sPart2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your array: ");
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Your Array: " + Arrays.toString(arr));
		System.out.println();
		int left = 0, right = arr.length - 1;
		while (left < right) {
			while (arr[left] == 0 && left < right) {
				left++;
			}
			while (arr[right] == 1 && left < right) {
				right--;
			}
			if (left < right) {
				arr[right] = 1;
				arr[left] = 0;
				left++;
				right--;
			}
		}
		System.out.println("Final Array: " + Arrays.toString(arr));
	}

}
