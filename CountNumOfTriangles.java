package com.siddhi.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumOfTriangles {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your array: ");
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Your Array: " + Arrays.toString(arr));
		Arrays.sort(arr);

		int count = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			int x = i + 2;
			for (int j = i + 1; j < arr.length; j++) {
				while (x < arr.length && arr[i] + arr[j] > arr[x]) {
					++x;
					count += x - j - 1;
				}
			}
		}
		System.out.println("Total num of triangles: " + count);
	}

}
