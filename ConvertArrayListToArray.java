package com.siddhi.arrays;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		String[] arr = new String[list.size()];
		list.toArray(arr);
		for (String str : arr) {
			System.out.println(str);
		}
	}

}
