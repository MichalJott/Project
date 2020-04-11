package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class EmailInformationService implements InformationService {

    public void inform(User user, Product product, LocalDate dateOfSale, boolean isSold) {
        if (isSold) {
            System.out.println("Dzień dobry, " + user.getFirstName() + user.getSurname()
                    + " \n zakupiłeś/aś: " + product.getNameOfProduct());
            System.out.println("Data zakupu: " + dateOfSale.toString());
            System.out.println("Cena zakupu: " + product.getPriceOfProduct() + " zł");
        } else {
            System.out.println("Dzień dobry, " + user.getFirstName() + " " + user.getSurname()
                    + " niestety nie możemy zrealizować Twojego zamówienia");
        }
    }
}
