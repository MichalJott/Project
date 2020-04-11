package com.kodilla.good.patterns.challenges.foof2door;

public class EmailService implements InformationService {

    public void sendInfoToClient(String productName){
        System.out.println("Confirmation sent. " + productName + '\n');
    }

}