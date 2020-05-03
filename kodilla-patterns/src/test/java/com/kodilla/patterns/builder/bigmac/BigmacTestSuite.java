package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BigmacTestSuite {

    @Test
    public void testCreatingNewBigmac(){

        //Given
        Sauce barbecueSauce = new Sauce("BARBECUE");
        Roll sezam = new Roll("SEZAM");


        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .roll(sezam)
                .burgersQuantity(1)
                .sauce(barbecueSauce)
                .ingredients("LETTUCE")
                .ingredients("ONION")
                .build();
        System.out.println(bigmac);

        List<String> expectedListIngredients = new ArrayList<>();
        expectedListIngredients.add("LETTUCE");
        expectedListIngredients.add("ONION");

        //When
        List<String> testedList = bigmac.getIngredients();
        //Then
        Assert.assertEquals(expectedListIngredients,testedList);
        Assert.assertEquals("SEZAM",bigmac.getRoll().getKind());
        Assert.assertEquals("BARBECUE",bigmac.getSauce().getTaste());

    }

}