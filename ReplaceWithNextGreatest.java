package com.siddhi.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceWithNextGreatest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ob = new Scanner(System.in);
		System.out.println("Ur Array: ");
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < 5; i++) {
			int replace = arr[i] + 1;
			// replace = arr[i];
			System.out.print(replace + ",");
		}
	}

}
