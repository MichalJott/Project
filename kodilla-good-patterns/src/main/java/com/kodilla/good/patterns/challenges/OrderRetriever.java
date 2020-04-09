package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderRetriever {

    public Order retrieve() {

        User user = new User("Michał ", "Jędrzejczyk,", "MJ", "mj@gmail.com");
        Product product = new Product("Hunted", BigDecimal.valueOf(99.97));
        Order order = new Order(user, LocalDate.of(2020, 04, 9), product);

        return order;
    }
}
