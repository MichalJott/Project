package com.kodilla.good.patterns.challenges.foof2door;

public class OrderRequest {

    private Shop delivery ;
    private Product product;
    private int quantity ;

    public OrderRequest(Shop delivery, Product product, int quantity) {
        this.delivery = delivery;
        this.product = product;
        this.quantity = quantity;
    }

    public Shop getDeliverer() {
        return delivery;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
