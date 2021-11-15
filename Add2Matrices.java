package com.siddhi.arrays;

import java.util.Scanner;

public class Add2Matrices {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int i, row, col, j;
		System.out.println("Input no. of rows: ");
		row = ob.nextInt();
		System.out.println("Input no. of columns: ");
		col = ob.nextInt();

		int arr[][] = new int[row][col];
		int arr1[][] = new int[row][col];
		int sum[][] = new int[row][col];

		System.out.println("Input elements of M1: ");

		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				arr[i][j] = ob.nextInt();
			}
		}
		System.out.println("Input elements of M2: ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				arr1[i][j] = ob.nextInt();
			}
		}
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				sum[i][j] = arr[i][j] + arr1[i][j];
			}
		}
		System.out.println("Sum: ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

}
