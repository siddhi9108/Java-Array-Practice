package com.siddhi.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAnElementInArray {

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
		System.out.println("Enter indexPosition: ");
		int index = ob.nextInt();
		System.out.println("Enter value: ");
		int val = ob.nextInt();
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = val;
		System.out.println();
		System.out.println("New Array: " + Arrays.toString(arr));
	}

}
