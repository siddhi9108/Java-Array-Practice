package com.siddhi.arrays;

import java.util.Scanner;

public class Q52 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ob = new Scanner(System.in);
		int even = 0, odd = 0;
		System.out.println("Enter your array: ");
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Ur Array: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i] % 2 == 0);
			break;
		}
		// System.out.println("Even: " + even + " , " + "Odd: " + odd);

	}

}
