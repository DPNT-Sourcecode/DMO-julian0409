package io.accelerate.solutions.DMO;

import io.accelerate.runner.SolutionNotImplementedException;

public class DemoRound4n5Solution {

    public String waves(Integer numberOfWaves) {
        // Ensure the input parameter is valid
        if (numberOfWaves == null || numberOfWaves <= 0) {
            throw new IllegalArgumentException("Number of waves must be a positive integer.");
        }

        StringBuilder waveOutput = new StringBuilder();
        int waveWidth = 6; // ASCII wave crest width
        int waveHeight = 4; // Wave crest height

        // Generate each wave crest
        for (int crest = 0; crest < numberOfWaves; crest++) {
            for (int row = 0; row < waveHeight; row++) {
                for (int col = 0; col < waveWidth; col++) {
                    if (row == 0 && (col == 2 || col == 3)) {
                        waveOutput.append("^"); // Top of the crest
                    } else if (row == 1 && (col == 1 || col == 4)) {
                        waveOutput.append("/"); // Slope of the crest
                    } else if (row == 1 && (col == 2 || col == 3)) {
                        waveOutput.append(" "); // Inner space of the crest
                    } else if (row == 2 && col == 2) {
                        waveOutput.append("\\"); // Bottom-left of the crest
                    } else if (row == 2 && col == 3) {
                        waveOutput.append("/"); // Bottom-right of the crest
                    } else if (row == 3 && col == 0) {
                        waveOutput.append("_"); // Base of the crest
                    } else if (row == 3 && col == 5) {
                        waveOutput.append("_"); // Base of the crest
                    } else {
                        waveOutput.append(" ");
                    }
                }
                waveOutput.append("\n"); // Move to the next row
            }
        }

        return waveOutput.toString();
    }
}