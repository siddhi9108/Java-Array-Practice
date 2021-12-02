package com.siddhi.arrays;

import java.util.Scanner;

public class Q40 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ob = new Scanner(System.in);
		int min1 = 0, min2 = 1;
		System.out.print("Enter the number of elements you want:");
		int x = ob.nextInt();
		int arr[] = new int[x];
		System.out.println("Enter all the numbers:");
		for (int i = 0; i < x; i++) {
			arr[i] = ob.nextInt();
		}
		int min = Math.abs(arr[0] + arr[1]);
		for (int i = 0; i < x; i++) {
			for (int j = i + 1; j < x; j++) {
				int sum = Math.abs(arr[i] + arr[j]);
				if (sum < min) {
					min1 = i;
					min2 = j;
					min = sum;
				}
			}
		}
		System.out.println(arr[min1]);
		System.out.println(arr[min2]);
	}

}
