package io.accelerate.solutions.DMO;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DemoRound4n5Solution {

    public String waves(Integer numberOfWaves) {
        // Validate input range
        if (numberOfWaves < 1 || numberOfWaves > 4) {
            throw new IllegalArgumentException("The number of waves must be between 1 and 4.");
        }

        // Redirect System.out to capture the legacy class's output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Store the original System.out
        System.setOut(new PrintStream(outputStream));

        try {
            // Call the legacy Waves.run() and provide the required input
            Waves.run(numberOfWaves);
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }

        // Return the captured output as a string
        return outputStream.toString().trim();
    }
}
