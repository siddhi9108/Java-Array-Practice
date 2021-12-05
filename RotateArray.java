package com.siddhi.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

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
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = arr[arr.length - 1];
		System.out.println("Rotated Array: " + Arrays.toString(arr));
	}

}
