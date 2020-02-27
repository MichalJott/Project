package com.kodilla.testing.calculator;

public class Calculator {
    int a = 7;
    int b = 3;

    public void subtract() {
        int result = a - b;

    }
    public void add() {
        int result = a + b;
        System.out.println(result);

    }
    public static void main (String [] args) {
        Calculator calculator = new Calculator();

    }
}
