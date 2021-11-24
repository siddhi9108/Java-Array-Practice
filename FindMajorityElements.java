package com.siddhi.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMajorityElements {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ob = new Scanner(System.in);
		int c = 0;
		int index = -1;
		System.out.println("Enter x: ");
		int x = ob.nextInt();
		System.out.println("Enter your array: ");
		int[] arr = new int[x];
		for (int i = 0; i < x; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Your Array: " + Arrays.toString(arr));
		// for (int i = 0; i < x; i++) {
		// System.out.print(arr[i] + ",");
		// }
		for (int i = 0; i < x; i++) {
			int count = 0;
			for (int j = 0; j < x; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
				if (count > c) {
					c = count;
					index = i;
				}
			}
			if (c > x / 2) {
				System.out.println(arr[index]);
				break;
			} else {
				System.out.println("No Majority Element");
				break;
			}
		}
	}

}
