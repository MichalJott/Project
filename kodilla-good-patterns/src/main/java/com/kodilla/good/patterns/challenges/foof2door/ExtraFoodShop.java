package com.kodilla.good.patterns.challenges.foof2door;


import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Shop {

    private OrderValidator orderValidator;
    private Map<Product, Integer> products = new HashMap<>();

    public ExtraFoodShop() {
        products.put(new Product("Shark oil", 10.0), 3);
        products.put(new Product("Frozen mussels", 9.8), 3);
        products.put(new Product("Sushi", 15.2), 3);
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
        return "Extra Food Shop";
    }



    private void updateStore(Product product, int quantity) {
        this.products.put(product, products.get(product) - quantity);
    }

}