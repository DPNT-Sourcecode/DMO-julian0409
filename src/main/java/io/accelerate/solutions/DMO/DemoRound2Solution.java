package io.accelerate.solutions.DMO;

import java.util.List;

public class DemoRound2Solution {
    public int arraySum(List<Integer> integerList) {
        if (integerList == null || integerList.isEmpty()) {
            return 0;
        }
        return integerList.stream().mapToInt(Integer::intValue).sum();
    }

    public List<Integer> intRange(int start, int end) {
        return java.util.stream.IntStream.range(start, end).boxed().toList();
    }

    public List<Integer> filterPass(List<Integer> integerList, int threshold) {
        if (integerList == null || integerList.isEmpty()) {
            return List.of();
        }
        return integerList.stream()
                .filter(value -> value >= threshold)
                .toList();
    }
}


