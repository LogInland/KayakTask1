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