package com.example;

public class Util {

	public static int max(int[] arr) {
		int ret = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > ret) ret = arr[i];
		}

		return ret;
	}

	public static int intStrWidth(int i) {
		int ret = 0;

		if (i < 0) ret++;
		if (i == 0) ret = 1;
		while (i != 0) {
			i /= 10;
			ret++;
		}

		return ret;
	}
}
