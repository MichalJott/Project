package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length).forEach(index -> {
            System.out.print("table[" + index + "] = ");
            System.out.println(numbers[index]);
        });
        return IntStream.of(numbers).average().getAsDouble();
    }
}

