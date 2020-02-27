package com.kodilla;

class Calculator  {

    public void subtract(int a, int b) {
        int result = a - b;

    }
    public void add(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
    public static void main (String [] args) {
        Calculator calculator = new Calculator();
        calculator.add(7,4);
    }
}
