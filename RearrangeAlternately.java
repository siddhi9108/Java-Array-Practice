package com.siddhi.arrays;

public class RearrangeAlternately {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = 0;
		int temp[] = new int[n];

		int small_num = 0, large_num = n - 1;
		boolean flag = true;

		for (int i = 0; i < n; i++) {
			if (flag)
				temp[i] = arr[large_num--];
			else
				temp[i] = arr[small_num++];

			flag = !flag;
		}
		System.out.println(temp);
	}
}
