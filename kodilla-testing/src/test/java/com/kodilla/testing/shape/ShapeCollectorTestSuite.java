package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testGetFigure() {
        //given
        Circle figure = new Circle();
        ShapeCollector list = new ShapeCollector();
        list.addFigure(figure);
        //when
        Shape result = list.getFigure(0);
        //then
        Assert.assertEquals(figure, result);
    }
    @Test
    public void testAddFigure() {
        Circle figure = new Circle();
        ShapeCollector list = new ShapeCollector();
        //when
        list.addFigure(figure);
        //then
        Assert.assertEquals(1, list.getShapeList().size());
    }
    @Test
    public void testRemoveFigure() {
        //given
        Circle figure = new Circle();
        ShapeCollector xxx = new ShapeCollector();
        xxx.addFigure(figure);
        //when
        boolean result = xxx.removeFigure(figure);
        //then
        Assert.assertEquals(true, result);
    }
}
