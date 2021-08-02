package com.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testFrequency() {
        int[] data = {1, 1, 1, 2, 3};
        int[][] expectedResult = {{1, 2, 3}, {3, 1, 1}};
        int[][] actualResult;

        NumberCalculator calc = new NumberCalculator();
        actualResult = calc.freaquency(data);
        assert(Arrays.equals(expectedResult[0], actualResult[0]));
        assert(Arrays.equals(expectedResult[1], actualResult[1]));
        
    }

     @Test
    void testParseArguments() {
        String[] arguments = {"1", "2", "Word", "4", "a[", "-"};
        int[] expectedResult = {1, 2, 4};
        int[] actualResult;

        NumberCalculator calc = new NumberCalculator();
        actualResult = calc.parseArguments(arguments);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void hackTest() {
        String expected = "%-4s";
        String actual = String.format("%%-%ds", 4);
        assertEquals(expected, actual);
    }
}
