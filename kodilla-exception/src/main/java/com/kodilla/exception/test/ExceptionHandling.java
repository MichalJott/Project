package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args)  {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(10.0, 11.0);
            System.out.println(result);

        } catch (Exception e){
            System.out.println("sth wrong");
        }
        finally {
            System.out.println("still working");
        }


    }
}
