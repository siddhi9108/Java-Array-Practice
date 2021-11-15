package com.siddhi.arrays;

import java.io.IOException;

public class abd {
	public static void main(String[] args) {

	}

	int err() throws Exception {
		try {
			throw new IOException("..");
		} catch (RuntimeException e) {
			throw new RuntimeException(e);
		} finally {
			return -1;
		}

	}
}
