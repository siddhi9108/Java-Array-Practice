package com.siddhi.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Segregate0sAnd1sRandomly {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ob = new Scanner(System.in);
		int count = 0;
		System.out.println("Ur Array: ");
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int left = 0;
		int right = 1;
		while (left < right) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					count++;
				}
			}
			for (int i = 0; i < count; i++) {
				arr[i] = 0;
			}
			for (int i = count; i < arr.length; i++) {
				arr[i] = 1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
