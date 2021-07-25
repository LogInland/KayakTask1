package com.example;

public class Canvas {
	private char[][] canvas;

	public void fillCanvas(int vertexI, int vertexJ, int[][] freqArr) {
		canvas = new char[vertexI][vertexJ];
		for (int i = 0; i < vertexI; i++) {
			for (int j = 0; j < vertexJ; j++) {
				if(j < freqArr[1][i]) {
					canvas[i][vertexJ - 1 - j] = '*';
				}
				else {
					canvas[i][vertexJ - 1 - j] = ' ';
				}
			}
		}
	}

	public char[][] getCanvas() {
		return canvas;
	}

	public void print(int vertexI, int vertexJ) {
		for (int j = 0; j < vertexJ; j++) {
			for (int i =0; i < vertexI; i++) {
				System.out.print(canvas[i][j]);
			}
			System.out.println();
		}
	}
}
