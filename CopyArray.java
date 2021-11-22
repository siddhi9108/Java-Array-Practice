package com.siddhi.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your Array ");
		int[] arr = new int[3];
		int[] arr1 = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Ur Array: ");
		for (int i = 0; i < 3; i++) {
			System.out.print("[" + arr[i] + "]");
		}
		for (int i = 0; i < 3; i++) {
			arr1[i] = arr[i];
		}
		System.out.println();
		System.out.println("new Array: " + Arrays.toString(arr1));
	}

}
