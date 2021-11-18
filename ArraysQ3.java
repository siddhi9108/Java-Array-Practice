package com.siddhi.arrays;

public class ArraysQ3 {

	public static void main(String[] args) {
		int i, j;
		int[][] arr = new int[10][10];
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				System.out.printf("-" + " ", arr[i][j]);
			}
			System.out.println();
		}
	}

}
