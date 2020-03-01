package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("start");
    }
    @After
    public void after(){
        System.out.println("end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer>emptyList = new ArrayList<>();

        ArrayList result = oddNumbersExterminator.exterminate(emptyList);
            System.out.println("empty list testing:" + result);

        Assert.assertEquals(emptyList, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer>wholeList = new ArrayList<>();
        wholeList.add(1);
        wholeList.add(2);
        wholeList.add(3);
        wholeList.add(4);

        ArrayList result2 = oddNumbersExterminator.exterminate(wholeList);
            System.out.println("normal list testing:" + result2);

        ArrayList<Integer> finalList = new ArrayList<>();
        finalList.add(2);
        finalList.add(4);

        Assert.assertEquals(finalList, result2);
    }
}