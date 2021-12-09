package com.siddhi.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOf4ElementsEqualToKey {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your array: ");
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Your Array: " + Arrays.toString(arr));
		System.out.println("enter key: ");
		int key = ob.nextInt();
		System.out.println();
		for (int i = 0; i < arr.length - 3; i++) {
			for (int j = 0; j < arr.length - 2; j++) {
				for (int k = 0; k < arr.length - 1; k++) {
					for (int l = 0; l < arr.length; l++) {
						if (arr[i] + arr[j] + arr[k] + arr[l] == key) {
							System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "+" + arr[l] + "=" + key);
						}
					}
				}
			}
		}
	}

}
