package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> valuesMap = new HashMap<>();
        valuesMap.put("warsaw", true);
        valuesMap.put("berlin", false);

        if (!valuesMap.containsKey(flight.getDepartureAirport()) || !valuesMap.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
    }


}
