package io.accelerate.solutions.DMO;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

class Waves {
    private static final DecimalFormat df;
    static {
        df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
    }

    public static void main(String[] args) {
        run(3);
    }

    static int currentLineCharCount = 0;

    public static void print(String variable) {
        System.out.print(variable);
        currentLineCharCount = currentLineCharCount + variable.length();
    }

    public static void print(float variable) {
        String text = df.format(variable);
        System.out.print(text);
        currentLineCharCount = currentLineCharCount + text.length();
    }

    public static void println() {
        System.out.println();
        currentLineCharCount = 0;
    }

    public static String tab(float numSpaces) {
        return " ".repeat(Math.round(numSpaces - currentLineCharCount));
    }

    public static int asInt(float variable) {
        return Math.round(variable);
    }

    public static float roundDownToInt(float variable) {
        return (float) Math.floor(variable);
    }

    public static float random(int positiveInt) {
        return 0.5f;
    }

    public static String mid(String text, float startingIndex, float numChars) {
        return text.substring(asInt(startingIndex - 1), asInt(startingIndex + numChars - 1));
    }

    public static float len(String text) {
        return (float) text.length();
    }

    public static void run(Integer numberOfWaves) {
        int label = 1;

        float scalarE = 0;
        float scalarF = 0;
        float scalarI = 0;
        float scalarJ = 0;
        float scalarL = 0;
        float scalarMS = 0;
        float scalarN = 0;
        float scalarS = 0;
        String stringW = "";
        boolean loopActive11 = false;
        boolean loopActive10 = false;

        int iterations = 0;

        mainLoop:
        while (true) {
            if (++iterations > 99999) {
                print("INFINITE LOOP DETECTED. STOPPING EXECUTION.");
                println();
                break;
            }

            if (loopActive11 && label > 13) loopActive11 = false;
            if (loopActive10 && label > 14) loopActive10 = false;

            switch (label) {
                case 1 -> label = 2;
                case 2 -> {
                    label = 3;
                    scalarF = numberOfWaves;
                }
                case 3 -> {
                    label = 4;
                    stringW = "____....~~~~''''~~~~....____";
                    scalarE = 7;
                    scalarMS = 4;
                }
                case 4 -> {
                    label = 5;
                    scalarL = len(stringW);
                }
                case 5 -> {
                    label = 10;
                    scalarN = scalarL / scalarF;
                    scalarS = scalarN / scalarE;
                }
                case 10 -> {
                    if (!loopActive10) {
                        scalarI = 1;
                        loopActive10 = true;
                    }
                    label = (scalarI - scalarF > 0) ? 90 : 11;
                }
                case 11 -> {
                    if (!loopActive11) {
                        scalarJ = 1;
                        loopActive11 = true;
                    }
                    label = ((scalarJ - scalarL) * scalarMS > 0) ? 14 : 12;
                }
                case 12 -> {
                    label = 13;
                    print(mid(stringW, scalarJ, scalarS));
                }
                case 13 -> {
                    scalarJ += scalarMS;
                    label = 11;
                }
                case 14 -> {
                    scalarI += 1;
                    label = (scalarI - scalarF > 0) ? 90 : 10;
                }
                case 90 -> {
                    label = 99;
                    println();
                }
                case 99 -> {
                    break mainLoop;
                }
                default -> throw new IllegalStateException("The label " + label + " is not recognized.");
            }
        }
    }
}



