package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private List<Country> countriesCollection;
    private String continentName;

    public Continent(String continentName){
        this.continentName = continentName;
        this.countriesCollection = new ArrayList<>();
    }

    public Continent(List<Country> countriesCollection, String continentName){
        this.countriesCollection =  countriesCollection;
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountriesCollection() {
        return countriesCollection;
    }

    public void setCountriesCollection(List<Country> countriesCollection){
        this.countriesCollection = countriesCollection;
    }
}
