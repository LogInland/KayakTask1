package com.example;

/**
 * Matrix
 */
public class Matrix {

	private int vertexI;
	private int vertexJ;
	private char[][] matrix;

	public Matrix(int vertexI, int vertexJ) {
		this.vertexI = vertexI;
		this.vertexJ = vertexJ;
		matrix = new char[vertexI][vertexJ];
	}

	public void addNumbersToMatrix(int[][] freaquencyList) {
		for (int i = 0; i < freaquencyList[0].length; i++) {
			if (freaquencyList[1][i] == 0) matrix[i][vertexJ - 1] = ' ';
			for (int j = 0; j < freaquencyList[1][i]; j++) {
				matrix[i][vertexJ - 1 - j] = '*';
			}
		}
	}

	public void printMatrix() {
		for (int i = 0; i < vertexI; i++) {
			for (int j = 0; j < vertexJ; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}