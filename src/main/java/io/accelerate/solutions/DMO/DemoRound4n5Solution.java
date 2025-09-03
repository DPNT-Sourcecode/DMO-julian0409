package io.accelerate.solutions.DMO;

public class DemoRound4n5Solution {

    public String waves(Integer numberOfWaves) {
        // Validate input range
        if (numberOfWaves < 1 || numberOfWaves > 4) {
            throw new IllegalArgumentException("The number of waves must be between 1 and 4.");
        }

        // Variables used in wave generation
        StringBuilder result = new StringBuilder();
        String waveString = "____....~~~~''''~~~~....____";
        float waveTotalLength = waveString.length(); // Total length of the wave
        float segmentLength = waveTotalLength / numberOfWaves; // N = L / F

        // Generate the entire wave step by step
        for (int i = 0; i < numberOfWaves; i++) {
            float start = (i * segmentLength) + 1; // Calculate start index for this crest
            result.append(mid(waveString, start, segmentLength)); // Append the scaled segment
        }

        return result.toString(); // Return the entire wave as a single continuous string
    }

    /**
     * Function to replicate the `MID$` behavior in Basic (substring extraction).
     */
    private String mid(String text, float startingIndex, float numChars) {
        int start = Math.round(startingIndex - 1); // Convert 1-based index to 0-based
        int end = Math.round(startingIndex + numChars - 1); // Calculate the ending index
        return text.substring(start, Math.min(end, text.length())); // Safely extract substring
    }
}