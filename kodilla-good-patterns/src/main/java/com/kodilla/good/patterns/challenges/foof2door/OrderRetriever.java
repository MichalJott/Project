package com.kodilla.good.patterns.challenges.foof2door;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class OrderRetriever {
    public List<OrderRequest> retrieve() {
        List<OrderRequest> requests = new LinkedList<>();

        HealthyShop healthy = new HealthyShop();
        GlutenFreeShop glutenFree = new GlutenFreeShop();
        ExtraFoodShop extraFood = new ExtraFoodShop();

        requests.add(new OrderRequest(glutenFree, new  Product("Rice cake", 12.3), 10));
        requests.add(new OrderRequest(healthy, new Product("Salmon", 12.1), 1));
        requests.add(new OrderRequest(extraFood, new Product("Sushi", 15.2), 1));
        return requests;
    }
}
