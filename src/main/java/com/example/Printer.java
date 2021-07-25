package com.example;

import static com.example.Util.*;

public class Printer {

	public static void printFrequencyArr(int[][] arr) {
		printArray(arr[1], "Frequency: ", 15, 3);
		printArray(arr[0], "Numbers: ", 15, 3);
	}

	public static void printArray(int[] arr, String prefix, int prefixWidth, int numWidth) {
		String prefixFormat = String.format("%%%ds", prefixWidth);
		String numberFormat = String.format("%%%ds", numWidth);
		System.out.printf(prefixFormat, prefix);
		for (int i = 0; i < arr.length; i++) {
			System.out.printf(numberFormat, arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
	}

	public static void printGraph(int vertexI, int vertexJ, char[][] canvas) {
		for (int j = 0; j < vertexJ; j++) {
			for (int i =0; i < vertexI; i++) {
				System.out.printf("%4C ", canvas[i][j]);
			}
			System.out.println();
		}
	}

	public static void printHistogram(int[][] frequencies) {
		int freq;
		int idx;
		int nextIdx;
		int minFreq = frequencies[0][0];
		int maxFreq = frequencies[0][frequencies[0].length - 1];
		int maxWidth = Integer.max(intStrWidth(maxFreq), intStrWidth(minFreq)) + 1;
		String format = String.format("%%%ds", maxWidth);

		for (int i = maxFreq; i > 0; i--) {
			for (int j = 0; j < frequencies[0].length - 1; j++) {
				idx = frequencies[0][j];
				nextIdx = frequencies[0][j + 1];
				freq = frequencies[1][j];
				printAsterisk(format, freq, i);
				printSpaces(nextIdx - idx - 1, maxWidth);
			}
			freq = frequencies[1][frequencies[1].length - 1];
			printAsterisk(format, freq, i);
			System.out.println();
		}
		printXaxis(minFreq, maxFreq, maxWidth);
	}

	private static void printSpaces(int amount, int width) {
		for (int i = 0; i < amount * width; i++) {
			System.out.print(' ');
		}
	}

	private static void printAsterisk(String format, int frequency, int row) {
		if (frequency >= row) {
			System.out.printf(format, "*");
		} else {
			System.out.printf(format, "");
		}
	}

	public static void printXaxis(int start, int stop, int strWidth) {
		String fmt = String.format("%%%dd", strWidth);
		for (int i = start; i <= stop; i++) {
			System.out.printf(fmt, i);
		}
		System.out.println();
	}
}
