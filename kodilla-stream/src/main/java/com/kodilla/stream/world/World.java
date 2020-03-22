package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class World {
    private List<Continent> continentCollection;

    public World(){

        Continent europa = new Continent("Europa");
        Country poland = new Country(new BigDecimal(39000000), "Poland");
        Country germany = new Country(new BigDecimal(50000000), "Germany");
        List<Country> countriesEur = new ArrayList<>();
        countriesEur.add(poland);
        countriesEur.add(germany);
        europa.setCountriesCollection(countriesEur);

        Continent asia = new Continent("Asia");
        Country russia = new Country(new BigDecimal(100000000), "Russia");
        Country japan = new Country(new BigDecimal(50000000), "Japan");
        List<Country> countriesAsia = new ArrayList<>();
        countriesAsia.add(russia);
        countriesAsia.add(japan);
        asia.setCountriesCollection(countriesAsia);

        Continent africa = new Continent("Africa");
        Country egipt = new Country(new BigDecimal(80000000), "Egipt");
        Country sudan = new Country(new BigDecimal(50000000), "Sudan");
        List<Country> countriesAfrica = new ArrayList<>();
        countriesAfrica.add(egipt);
        countriesAfrica.add(sudan);
        africa.setCountriesCollection(countriesAfrica);

        this.continentCollection = new ArrayList<>();
        this.continentCollection.add(europa);
        this.continentCollection.add(asia);
        this.continentCollection.add(africa);
    }

    public World(List<Continent> continentCollection){
        this.continentCollection =  continentCollection;
    }

    public void setContinentCollection(List<Continent> continentCollection) {
        this.continentCollection = continentCollection;
    }

    public BigDecimal getPeopleQuantity(){

        List<List<Country>> nestedCountriesLists = this.continentCollection.stream()
                .flatMap(continent -> Stream.of(continent.getCountriesCollection())).collect(Collectors.toList());

        List<Country> countryList = new ArrayList<>();
        nestedCountriesLists.forEach(countryList::addAll);

        Stream<BigDecimal> peopleQuantities = countryList.stream()
                .flatMap(country -> Stream.of(country.getPeopleQuantity()));
        return peopleQuantities
                .reduce(new BigDecimal(0),
                        BigDecimal::add);

    }
}
