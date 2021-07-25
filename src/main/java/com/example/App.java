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
        Printer printer = new Printer();

        int[] numbers = calculator.parseArguments(args);
        int[][] freqArr = calculator.freaquency(numbers);
        FrequencyArray frequencyArray = new FrequencyArray(calculator.getMaxFreaquency(),
        freqArr[0][0], freqArr);

        printer.printFrequency(frequencyArray.getFrequencyArray());
        printer.printNumbers(frequencyArray.getFrequencyArray());
       
        frequencyArray.setFrequencyArray(calculator.getFilledArray(frequencyArray.getFrequencyArray()));
        System.out.println();
        Canvas canvas = new Canvas();
        int vertexI = frequencyArray.getLenght();
        int vertexJ = frequencyArray.getMaxFreaquency();

        canvas.fillCanvas(vertexI, vertexJ, frequencyArray.getFrequencyArray());
        printer.printGraph(vertexI, vertexJ, canvas.getCanvas());
        printer.printXaxis(frequencyArray.getFirstElement(), frequencyArray.getLenght());
    }

}
