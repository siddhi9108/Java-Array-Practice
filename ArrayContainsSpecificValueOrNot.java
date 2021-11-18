package com.siddhi.arrays;

import java.util.Scanner;

public class ArrayContainsSpecificValueOrNot {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = ob.nextInt();
		System.out.println("Enter your array: ");
		int[] arr = new int[x];
		for (int i = 0; i < x; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Your array: ");
		for (int i = 0; i < x; i++) {
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
		System.out.println("Enter key: ");
		int key = ob.nextInt();
		for (int i = 0; i < x; i++) {
			if (arr[i] == key) {
				System.out.println("Contains");
				break;
			} else {
				System.out.println("Dosen't contains");
				break;
			}
		}
	}

}
