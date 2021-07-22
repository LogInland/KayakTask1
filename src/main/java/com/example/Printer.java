package com.example;

public class Printer {

	

	public static void printBasic(int[][] list) {
		int indexA = list[0][0];		
		System.out.printf("%-12s", "Freaquency:");
		for (int i = 0; i < list[0].length; i++) {
			while (indexA != list[0][i]) {
				System.out.printf("%3d%s", 0, ", ");
				indexA++;
			}
			System.out.printf("%3d", list[1][i]);

			if (i != list[0].length - 1) {
				System.out.print(", ");
			}
			else {
				System.out.println();
			}
			indexA++;
		} 
		
		indexA = list[0][0];
		System.out.printf("%-12s", "Numbers:");
		for (int i = 0; i < list[0].length; i++) {
			while (indexA != list[0][i]) {
				System.out.printf("%3d%s", indexA, ", ");
				indexA++;
			}
			System.out.printf("%3d", list[0][i]);

			if (i != list[0].length - 1) {
				System.out.print(", ");
			}
			else {
				System.out.println();
			}
			indexA++;
		}
	}

	public static void printGraph(int[][] list) {
		char[][] graph = new char[list[0].length][];
	}
}
