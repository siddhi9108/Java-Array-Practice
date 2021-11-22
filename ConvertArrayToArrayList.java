package com.siddhi.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		String[] arr = new String[] { "Sid", "Siddhi", "Amilkanthwar" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));

		System.out.println(list);
	}

}
