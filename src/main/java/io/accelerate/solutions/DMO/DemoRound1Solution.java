package io.accelerate.solutions.DMO;

import io.accelerate.runner.SolutionNotImplementedException;

public class DemoRound1Solution {

    /**
     * Increment a given integer by one.
     *
     * @param x an integer to be incremented
     * @return an integer incremented by one
     */
    public int increment(int x) {
        return x + 1;
    }

    /**
     * Convert all letters of the input string to uppercase.
     *
     * @param text the input string
     * @return the input string converted to uppercase
     */
    public String toUppercase(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return text.toUpperCase();
    }

    /**
     * Compose a letter to Santa.
     * Example content of the letter can be:
     * "Dear Santa, I hope you are doing well."
     *
     * @return a String containing the letter to Santa
     */
    public String letterToSanta() {
        return "Dear Santa, I hope you are doing well.";
    }

    /**
     * Count the number of lines in a given multi-line string.
     *
     * @param text the input string containing multiple lines
     * @return the number of lines in the input string
     */
    public int countLines(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text.split("\r\n|\r|\n").length;
    }
}
