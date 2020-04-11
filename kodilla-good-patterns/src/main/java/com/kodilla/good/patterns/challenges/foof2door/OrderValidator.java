package com.kodilla.good.patterns.challenges.foof2door;

import java.util.Map;

public class OrderValidator {

    public static boolean orderValidate(Map<Product, Integer> products, Product product, int quantity) {
        if(products.containsKey(product)) {
            int quantityInShop = products.get(product);
            if (quantityInShop >= quantity) {
                System.out.println("Ordered: \n" + product.getName() + " " + "Quantity: " + quantity);
                return true;
            } else {
                System.out.println("Ordered: " + quantity + " " + product.getName() + " but only " + quantityInShop + " left\n");
                return false;
            }
        }else {
            return false;
        }
    }
}
