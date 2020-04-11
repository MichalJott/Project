package com.kodilla.good.patterns.challenges.foof2door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Shop {

    private OrderValidator orderValidator;
    private Map<Product, Integer> products = new HashMap<>();

    public HealthyShop() {
        products.put(new Product("Cob fish", 12.3), 3);
        products.put(new Product("Soi burger", 14.1), 3);
        products.put(new Product("Salmon", 12.1), 3);
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
        return "Healthy Shop";
    }

    private void updateStore(Product product, int quantity) {
        this.products.put(product, products.get(product) - quantity);
    }
}
