package com.siddhi.arrays;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = ob.nextInt();
		System.out.println("Enter your array: ");
		int[] arr = new int[x];
		for (int i = 0; i < x; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Your Array: ");
		for (int i = 0; i < x; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int t = 0;
				if (arr[i] > arr[j]) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
		System.out.println("Enter s: ");
		int s = ob.nextInt();
		System.out.println("Enter your array: ");
		String[] arr1 = new String[s];
		for (int i = 0; i < s; i++) {
			arr1[i] = ob.next();
		}
		System.out.println("Your Array: ");
		for (int i = 0; i < s; i++) {
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				String t1 = null;
				if (arr1[i].compareTo(arr1[j]) > 0) {
					t1 = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = t1;
				}
			}
			System.out.print("[" + arr1[i] + "]");
		}
	}

}
