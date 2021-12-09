package com.siddhi.arrays;

public class SumOfAll10Is30 {

	public static void main(String[] args) {
		int[] arr = { 10, 3, 10, 30, 1 };
		int searchNum = 10;
		int sum = 30;
		System.out.println("Result: " + result(arr, searchNum, sum));
	}

	public static boolean result(int[] numbers, int searchNum, int sum) {
		int temp_sum = 0;
		for (int number : numbers) {
			if (number == searchNum) {
				temp_sum += searchNum;
			}

			if (temp_sum > sum) {
				break;
			}
		}
		return temp_sum == sum;
	}

}
