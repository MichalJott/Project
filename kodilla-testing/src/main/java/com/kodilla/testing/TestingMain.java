package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int output = calculator.add(4,2);

        if(output == 5) {
            System.out.println("test add ok");
        }else {
            System.out.println("error add");
        }
        Calculator calculator2 = new Calculator();

        int output2 = calculator2.subtract(4,2);

        if(output2 == 2) {
            System.out.println("test subtract ok");
        }else {
            System.out.println("error subtract");
        }
    }
}
