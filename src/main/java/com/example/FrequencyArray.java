package com.example;

import java.io.ObjectInputStream.GetField;

public class FrequencyArray {
	private int[][] frequencyArray;
	private int maxFrequency;
	private int firstElement;
	private int lenght;


	public FrequencyArray(int maxFrequency, int firstElement, int[][] freaquencyArray) {
		this.maxFrequency = maxFrequency;
		this.firstElement = firstElement;
		this.frequencyArray = freaquencyArray;
		lenght = freaquencyArray[0].length;
	}

	public void setFrequencyArray(int[][] frequencyArray) {
		this.frequencyArray = frequencyArray;
		lenght = frequencyArray[0].length;
	}

	public int[][] getFrequencyArray() {
		return frequencyArray;
	}

	public int getMaxFreaquency() {
		return maxFrequency;
	}

	public int getFirstElement() {
		return firstElement;
	}

	public int getLenght() {
		return frequencyArray[0].length;
	}

	/* public int[][] getFilledArray(int[][] freqArr, int numberCount) {
		int[][] ret = new int[2][numberCount];

		if(freqArr[0].length != 0) {
			int indexA = freqArr[0][0];
			int indexRet = 0;
			for (int i = 0; i < freqArr[0].length; i++) {
				while (indexA != freqArr[0][i]) {
					ret[0][indexRet++] = indexA;
					indexA++;
				}
				ret[1][indexRet] = freqArr[1][i];
				ret[0][indexRet++] = freqArr[0][i];
				indexA++;
			}
		}
		return ret;
	} */
}
