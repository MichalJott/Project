package com.kodilla.good.patterns.challenges.flight_browser;

public class FlightRetriever {

    public static FlightRegister retrieve() {

        Flight flight1 = new Flight("Katowice", "Warszawa", 45);
        Flight flight2 = new Flight("Katowice", "Rzeszów", 456);
        Flight flight3 = new Flight("Warszawa", "Łódź", 3257);
        Flight flight4 = new Flight("Katowice", "Łódź", 468);
        Flight flight5 = new Flight("Warszawa", "Katowice", 2524);
        Flight flight6 = new Flight("Kraków", "Łódź", 4568);
        Flight flight7 = new Flight("Katowice", "Kraków", 23567);
        Flight flight8 = new Flight("Katowice", "Warszawa", 3478);
        Flight flight9 = new Flight("Katowice", "Warszawa", 579);
        Flight flight10 = new Flight("Kraków", "Katowice", 367);

        FlightRegister flightRegister = new FlightRegister();
        flightRegister.addFlight(flight1);
        flightRegister.addFlight(flight2);
        flightRegister.addFlight(flight3);
        flightRegister.addFlight(flight4);
        flightRegister.addFlight(flight5);
        flightRegister.addFlight(flight6);
        flightRegister.addFlight(flight7);
        flightRegister.addFlight(flight8);
        flightRegister.addFlight(flight9);
        flightRegister.addFlight(flight10);

        return flightRegister;
    }
}
