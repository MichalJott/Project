package com.kodilla.testing.calculator;

public class Calculator {

    public int subtract(int a, int b) {
        int result = a - b;
        return result;

    }
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }
    public static void main (String [] args) {
        Calculator calculator = new Calculator();
        calculator.add(7,4);
    }
}
