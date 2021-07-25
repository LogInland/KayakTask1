package com.example;

public class Printer {

	public void printFrequency(int[][] freqArr) {
		if(freqArr[0].length != 0){
			System.out.printf("%-12s", "Freaquency:");
			for (int i = 0; i < freqArr[0].length; i++) {
				System.out.printf("%3d", freqArr[1][i]);
				if (i != freqArr[0].length - 1) {
					System.out.print(", ");
				}
				else {
					System.out.println();
				}
			}
		}
	}

	public void printNumbers(int[][] freqArr) {
		 System.out.printf("%-12s", "Numbers:");
		for (int i = 0; i < freqArr[0].length; i++) {
			System.out.printf("%3d", freqArr[0][i]);
			if (i != freqArr[0].length - 1) {
				System.out.print(", ");
			}
			else {
				System.out.println();
			}
		}
	}

	public void printGraph(int vertexI, int vertexJ, char[][] canvas) {
		for (int j = 0; j < vertexJ; j++) {
			for (int i =0; i < vertexI; i++) {
				System.out.printf("%4C ", canvas[i][j]);
			}
			System.out.println();
		}
	}

	public void printXaxis(int axisStart, int axisLenght) {
		for (int i = 0; i < axisLenght; i++) {
			System.out.printf("%4d ", axisStart++);
		}
	}
}
