package com.kodilla.good.patterns.challenges.flight_browser;

public class Application {

    public static void main(String[] args) {

        FlightRegister flightRegister = FlightRetriever.retrieve();

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightRegister.getListOfFlights());
        flightSearchEngine.searchByCityOfDeparture("Katowice");
        flightSearchEngine.searchByCityOfArrival("Łódź");
        flightSearchEngine.searchByCityForTransfer("Katowice","Kraków", "Łódź");
    }
}
