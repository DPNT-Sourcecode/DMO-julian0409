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
        int waveElementCount = 7; // 7 segments in a cycle of the wave
        float waveTotalLength = waveString.length(); // Total length of the wave
        float segmentLength = waveTotalLength / numberOfWaves; // N = L / F
        float segmentWidth = segmentLength / waveElementCount; // S = N / E

        // Generate the entire wave as a single string
        for (float j = 1; j <= waveTotalLength; j += segmentWidth) {
            result.append(mid(waveString, j, segmentWidth));
        }

        // Repeat the single wave segment as many times as necessary
        String waveUnit = result.toString(); // Capture the one full crest
        result.setLength(0); // Clear the StringBuilder

        for (int i = 0; i < numberOfWaves; i++) {
            result.append(waveUnit);
        }

        return result.toString(); // Return complete wave without any newlines
    }

    /**
     * Function to replicate the `MID$` behavior in Basic (substring extraction).
     */
    private String mid(String text, float startingIndex, float numChars) {
        int start = Math.round(startingIndex - 1); // Convert 1-based index to 0-based
        int end = Math.round(startingIndex + numChars - 1); // Calculate the ending index
        return text.substring(start, Math.min(end, text.length())); // Extract substring safely
    }
}