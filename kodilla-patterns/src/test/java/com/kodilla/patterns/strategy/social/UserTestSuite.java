package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User michael = new Millenials("Michael Burry");
        User tom = new YGeneration("Tom Clancy");
        User mat = new ZGeneration("Mat Smith");

        //When
        String michaelPublish = michael.getWherePublish();
        System.out.println("Michael: " + michaelPublish);
        String tomPublish = tom.getWherePublish();
        System.out.println("Tom: " + tomPublish);
        String matPublish = mat.getWherePublish();
        System.out.println("Mat: " + matPublish);

        //Then
        Assert.assertEquals("-Sharing posts on snapChat", michaelPublish);
        Assert.assertEquals("-Sharing posts on facebook", tomPublish);
        Assert.assertEquals("-Sharing posts on twitter", matPublish);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User michael = new Millenials("Michael Burry");

        //When
        String michaelPublish = michael.getWherePublish();
        System.out.println("Michael: " + michaelPublish);
        michael.setWherPublish(new FacebookPublisher());
        michaelPublish = michael.getWherePublish();
        System.out.println("but now Michael: " + michaelPublish);

        //Then
        Assert.assertEquals("-Sharing posts on facebook", michaelPublish);
    }
}