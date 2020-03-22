package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {    private BigDecimal peopleQuantity;
    private String countryName;

    public Country(String countryName){
        this.peopleQuantity = new BigDecimal(0);
        this.countryName = countryName;
    }

    public Country(BigDecimal peopleQuantity, String countryName){
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    public void setPeopleQuantity(BigDecimal peopleQuantity){
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity(){
        return this.peopleQuantity;
    }
    public String getCountryName(){
        return this.countryName;
    }
}
