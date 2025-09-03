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
        int tabSpaces = 4;        // Tab factor for spacing
        float waveTotalLength = waveString.length(); // Total length of the wave
        float segmentLength = waveTotalLength / numberOfWaves; // N = L / F
        float segmentWidth = segmentLength / waveElementCount; // S = N / E

        // Generate waves and store in result
        for (int i = 1; i <= numberOfWaves; i++) {
            for (float j = 1; j <= waveTotalLength; j += tabSpaces) {
                // Append the substring as per the mid logic
                result.append(mid(waveString, j, segmentWidth));
            }

            if (i != numberOfWaves) {
                result.append(System.lineSeparator()); // Add a line break except for the last crest
            }
        }

        return result.toString();
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

