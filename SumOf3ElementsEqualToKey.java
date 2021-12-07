package com.siddhi.arrays;

import java.util.Scanner;

public class SumOf3ElementsEqualToKey {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter key: ");
		int key = ob.nextInt();
		int[] arr = new int[] { 1, 23, 3, 4, 22, 12, 5, 67, 7 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (i <= j && j <= k && i != j && j != k && i != k) {
						if (arr[i] + arr[j] + arr[k] == key) {
							System.out.println("Index: " + i + "," + "Index: " + j + "," + "Index: " + k);
						}
					}
				}
			}
		}
	}

}
