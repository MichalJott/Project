package com.kodilla;

import org.springframework.http.converter.json.GsonBuilderUtils;

class Calculator  {

        public void subract() {
            System.out.println("It works");
        }

        public void add() {
            System.out.println("Ok");
        }
    public static void main (String [] args) {
        Calculator calculator = new Calculator();
        calculator.add();
    }
}
