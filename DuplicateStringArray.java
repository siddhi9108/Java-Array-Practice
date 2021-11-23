package com.siddhi.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateStringArray {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = ob.nextInt();
		System.out.println("Enter your array: ");
		String[] arr = new String[x];
		for (int i = 0; i < x; i++) {
			arr[i] = ob.next();
		}
		System.out.println("Your array: ");
		for (int i = 0; i < x; i++) {
			System.out.print(Arrays.toString(arr));
			break;
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate: " + arr[j]);
				} else {
					System.out.println("No Duplicate");
					break;
				}
			}
		}
	}

}
