package com.kodilla.good.patterns.challenges.foof2door;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new EmailService());
        OrderRetriever orderRetriever = new OrderRetriever();
        List<OrderRequest> orderRequests = orderRetriever.retrieve();
        for (OrderRequest orderRequest: orderRequests) {
            orderProcessor.orderExecutor(orderRequest);
        }
    }

}
