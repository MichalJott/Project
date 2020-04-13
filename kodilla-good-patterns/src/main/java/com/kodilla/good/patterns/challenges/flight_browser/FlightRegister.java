package com.kodilla.good.patterns.challenges.flight_browser;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FlightRegister {

    private Set<Flight> listOfFlights = new HashSet<Flight>();

    public boolean addFlight (Flight flight){
        listOfFlights.add(flight);
        return true;
    }

    public Set<Flight> getListOfFlights(){
        return Collections.unmodifiableSet(listOfFlights);
    }


}
