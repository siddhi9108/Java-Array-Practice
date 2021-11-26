package com.siddhi.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestAndSecondSmallest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your array: ");
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = ob.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("Sorted: ");
		for (int i = 0; i < 5;) {
			// System.out.print(arr[i]);
			System.out.println(Arrays.toString(arr));
			break;
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}

}
