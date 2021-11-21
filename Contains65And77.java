package com.siddhi.arrays;

public class Contains65And77 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 9, 65, 77 };
		for (int i = 0; i < arr.length;) {
			if (arr[i] == 65 && arr[i] == 77) {
				System.out.println("Present");
				break;
			} else {
				System.out.println("Not Present");
				break;
			}
		}
	}

}
