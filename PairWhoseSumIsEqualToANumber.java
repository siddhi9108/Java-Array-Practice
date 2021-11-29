package com.siddhi.arrays;

import java.util.Scanner;

public class PairWhoseSumIsEqualToANumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 5, 6, 78, 90 };
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter you key: ");
		int x = ob.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == x) {
					System.out.println(arr[i] + "+" + arr[j] + "=" + x);
				}
			}
		}
	}

}
