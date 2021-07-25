package com.example;

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

        int[] numbers = calculator.parseArguments(args);
        int[][] freqArr = calculator.freaquency(numbers);
        Printer.printHistogram(freqArr);
        System.out.println();
        Printer.printFrequencyArr(freqArr);
    }

}
