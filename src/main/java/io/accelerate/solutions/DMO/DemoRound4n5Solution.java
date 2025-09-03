package io.accelerate.solutions.DMO;

import java.io.ByteArrayInputStream;

public class DemoRound4n5Solution {

    public String waves(Integer numberOfWaves) {
        // Validate input range
        if (numberOfWaves < 1 || numberOfWaves > 4) {
            throw new IllegalArgumentException("The number of waves must be between 1 and 4.");
        }

        // Redirect stdin to simulate user input
        ByteArrayInputStream inputStream = new ByteArrayInputStream(numberOfWaves.toString().getBytes());
        System.setIn(inputStream);

        // Call legacy Waves.run() method
        Waves.run();

        // Restore System.in if necessary
        System.setIn(System.in);

        return null; // Replace with actual captured output if needed
    }
}