package com.kodilla.testing.collection;

import java.lang.*;
import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int even = numbers.get(i) % 2;
            if (even == 0) {
                evenNumbers.add(numbers.get(i));
            }
        }
        return evenNumbers;
    }
}