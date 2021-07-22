package com.example;

import java.util.Arrays;


import javax.lang.model.util.ElementScanner14;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        NumberCalculator calculator = new NumberCalculator();

        int[] numbersArr = calculator.parseArguments(args);
        int[][] freqArr = calculator.freaquency(numbersArr);

        Printer.printBasic(freqArr);


        Matrix matrix = new Matrix(freqArr[0].length, calculator.getMaxFreaquency());
        matrix.addNumbersToMatrix(freqArr);
        matrix.printMatrix();
       /*  for (int i = 0; i < freqArr[0].length; i++) {
            System.out.println(freqArr[0][i] + " " + freqArr[1][i]);
        } */
    }
}
