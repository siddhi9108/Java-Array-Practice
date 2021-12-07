package com.siddhi.arrays;

import java.util.Scanner;

public class SumOf2ElementsEqualToKey {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter key: ");
		int key = ob.nextInt();
		int[] arr = new int[] { 1, 23, 3, 4, 22, 12, 5, 67, 7 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == key) {
					System.out.println("Index: " + i + "," + "Index: " + j);
				}
			}
		}
	}

}
