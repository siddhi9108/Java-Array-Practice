package com.siddhi.arrays;

public class CheckArrayWithout0AndNeg1 {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 0 };
		boolean itContain = false;
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == -1) {
				itContain = true;
				break;
			}
		}
		if (itContain) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
	}

}
