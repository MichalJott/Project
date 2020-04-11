package com.kodilla.good.patterns.challenges.foof2door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Shop {

    private Map<Product, Integer> products = new HashMap<>();
    private OrderValidator orderValidator;

    public GlutenFreeShop() {
        products.put(new Product("Corn starch", 11.0), 3);
        products.put(new Product("Rice cake", 12.3), 3);
        products.put(new Product("Pizza dough", 10.4), 3);

    }
    @Override
    public boolean process(Product product, int quantity) {
        boolean result = orderValidator.orderValidate(products,product, quantity);
        if (result) {
            updateStore(product, quantity);
            System.out.println("Now left : " + products.get(product) + " " + product.getName() + " in shop");
        }
        return result;

    }

    @Override
    public String getName() {
        return "Gluten Free Shop";
    }

    private void updateStore(Product product, int quantity) {
        this.products.put(product, products.get(product) - quantity);
    }

}