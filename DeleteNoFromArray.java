package com.siddhi.arrays;

import java.util.Scanner;

public class DeleteNoFromArray {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter Array: ");
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Ur Array: ");
		for (int i = 0; i < 3; i++) {
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
		System.out.println("Enter key: ");
		int key = ob.nextInt();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == key) {
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
			}
		}

		System.out.println();
		System.out.println("Ur Array after removal: ");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
