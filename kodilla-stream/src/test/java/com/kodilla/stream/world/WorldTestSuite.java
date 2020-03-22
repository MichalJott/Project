package com.kodilla.stream.world;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void getPeopleQuantityDefaultValues() {
        World world = new World();
        assertEquals(new BigDecimal(369000000), world.getPeopleQuantity());
    }

    @Test
    void getPeopleQuantityDefaultNewValues() {

        Continent europa = new Continent("Europa");
        Country poland = new Country(new BigDecimal(10000000), "Poland");
        Country germany = new Country(new BigDecimal(10000000), "Germany");
        List<Country> countriesEur = new ArrayList<>();
        countriesEur.add(poland);
        countriesEur.add(germany);
        europa.setCountriesCollection(countriesEur);

        Continent asia = new Continent("Asia");
        Country russia = new Country(new BigDecimal(20000000), "Russia");
        Country japan = new Country(new BigDecimal(20000000), "Japan");
        List<Country> countriesAsia = new ArrayList<>();
        countriesAsia.add(russia);
        countriesAsia.add(japan);
        asia.setCountriesCollection(countriesAsia);

        Continent africa = new Continent("Africa");
        Country egipt = new Country(new BigDecimal(30000000), "Egipt");
        Country sudan = new Country(new BigDecimal(30000000), "Sudan");
        List<Country> countriesAfrica = new ArrayList<>();
        countriesAfrica.add(egipt);
        countriesAfrica.add(sudan);
        africa.setCountriesCollection(countriesAfrica);

        List<Continent> continentCollection = new ArrayList<>();
        continentCollection.add(europa);
        continentCollection.add(asia);
        continentCollection.add(africa);

        World world = new World(continentCollection);
        assertEquals(new BigDecimal(120000000), world.getPeopleQuantity());
    }
}
