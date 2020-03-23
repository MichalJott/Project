package com.kodilla.exception.test;

public class FlightHand {
    public static void main (String[] args) {
        FlightFinder check = new FlightFinder();

        try {
            check.findFlight(new Flight("Tokio", "sfgads"));
        } catch (RouteNotFoundException e) {
            System.out.println("not exist");
        }
        finally {
            System.out.println("ok");
        }

    }
}
