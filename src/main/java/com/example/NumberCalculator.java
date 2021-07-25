package com.example;

import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * NumberCalculator
 */
public class NumberCalculator {

    private int maxFreq;

	public int[][] freaquency(int[] list) {
        SortedMap<Integer,Integer> freqTree = new TreeMap<Integer, Integer>();
        int maxFreq = 0;

        for (int i = 0; i < list.length; i++) {
            addNumber(freqTree, list[i]);
        }
        int i = 0;
        int ret[][] = new int [2][freqTree.size()];
        for (Map.Entry<Integer, Integer> entry : freqTree.entrySet()) {
            ret[0][i] = entry.getKey();
            ret[1][i++] = entry.getValue();
            if (entry.getValue() > maxFreq) maxFreq = entry.getValue();
        }
        return ret;
    }

    public int getMaxFreaquency() {
        return maxFreq;
    }   

    public int getNumbersCount(int[][] numberArr) {
        int ret = 0;
        if(numberArr[0].length != 0) {
            int indexA = numberArr[0][0];
            ret = numberArr[0].length;
            for (int i = 0; i < numberArr[0].length; i++) {
                while (indexA != numberArr[0][i]) {
                    indexA++;
                    ret++;
                }
                indexA++;
            }
        }
        return ret;
    }

    public int[][] getFilledArray(int[][] freqArr) {
		int[][] ret = new int[2][getNumbersCount(freqArr)];
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
	}

    private void addNumber(SortedMap<Integer, Integer> map, int index) {
        if(map.containsKey(index)) {
            map.put(index, map.get(index) + 1);
        }
        else {
            map.put(index, 1);
        }
    }

    public int[] parseArguments(String[] args) {
        int[] numbers = new  int [args.length];
        int index = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[index] = Integer.parseInt(args[i]);
                index++;
            }
            catch (NumberFormatException nfe) {
                System.out.println("Bad number format: " + args[i]);
            }
        }
        numbers = Arrays.copyOf(numbers, index);
        return numbers;
    }
}