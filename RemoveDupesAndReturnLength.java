package com.siddhi.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDupesAndReturnLength {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter x : ");
		int x = ob.nextInt();
		System.out.println("Your Array: ");
		int[] arr = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		List<int[]> l = Arrays.asList(arr).stream().distinct().collect(Collectors.toList());
		System.out.println();
		System.out.println("Array after deletion: ");
		for (int i = 0; i < arr.length - 1;) {
			System.out.println(Arrays.toString(arr));
			break;
		}
		System.out.println(arr.length - 1);
	}

}
