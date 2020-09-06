package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderBasicGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        //When
        BigDecimal calculatedCost = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testPizzaOrderBasicGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Home Pizza", description);
    }

    @Test
    public void testCheeseDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new CheeseDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(16), thePrice);
    }

    @Test
    public void testCheeseDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new CheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Home Pizza + ser podlaski", description);
    }

    @Test
    public void testHamDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new CheeseDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(16), thePrice);
    }

    @Test
    public void testHamDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new HamDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Home Pizza + szynka z dzika", description);
    }

    @Test
    public void testMushroomsDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new MushroomsDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(17), thePrice);
    }

    @Test
    public void testMushroomsDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new MushroomsDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Home Pizza + grzybki", description);
    }

    @Test
    public void testPanThickDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new PanThickDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(16), thePrice);
    }

    @Test
    public void testPanThickDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new PanThickDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Home Pizza + grube ciasto", description);
    }

    @Test
    public void testPaprikaDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new PaprikaDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(17), thePrice);
    }

    @Test
    public void testPaprikaDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new PaprikaDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Home Pizza + papryka", description);
    }

    @Test
    public void testPizzaWithPanThickAndHamAndCheeseDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new PanThickDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(19), thePrice);
    }

    @Test
    public void testPizzaWithHamAndCheeseDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new PanThickDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Home Pizza + grube ciasto + szynka z dzika + ser podlaski", description);
    }

    @Test
    public void testPizzaWithMushroomsAndPaprikaDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new PaprikaDecorator(theOrder);
        System.out.println(theOrder.getPrice());
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(19), thePrice);
    }

    @Test
    public void testPizzaWithMushroomsAndPaprikaDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new PaprikaDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Home Pizza + grzybki + papryka", description);
    }
}
