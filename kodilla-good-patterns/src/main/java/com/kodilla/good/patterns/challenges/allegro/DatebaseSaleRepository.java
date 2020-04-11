package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class DatebaseSaleRepository implements SalesRepository {

    @Override
    public void createSaleProduct(User user, Product product, LocalDate dateOfSale) {
        System.out.println("\nZapisanie do bazy sprzedaży " + product.getNameOfProduct() + " użytkownikowi " + user.getUserName()
                + " po cenie " + product.getPriceOfProduct() + " w dniu " + dateOfSale.toString());
        System.out.println("Email do kontaktu: " + user.getEmail());
    }
}