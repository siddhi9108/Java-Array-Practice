package com.siddhi.arrays;

import java.util.Scanner;

public class AverageOfArray {

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
		int sum = 0;
		int avg = 0;
		for (int i : arr) {
			sum += i;
			avg = sum / x;
		}
		System.out.println();
		System.out.println("Your average: " + avg);
	}

}
