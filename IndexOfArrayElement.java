package com.siddhi.arrays;

import java.util.Scanner;

public class IndexOfArrayElement {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter Array: ");
		// int x = ob.nextInt();
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Ur Array: ");
		for (int i = 0; i < 3; i++) {
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
		System.out.println("Enter key: ");
		int key = ob.nextInt();
		for (int i = 0; i < 3; i++) {
			if (arr[i] == key) {
				System.out.println(i);
			} else {
				System.out.println("Wrong");
				break;
			}
		}
	}

}
