package com.kodilla.testing.shape;

import org.junit.AfterClass;
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

        ShapeCollector testShapeCollector = new ShapeCollector();

        testShapeCollector.addFigure(new Circle());
        testShapeCollector.addFigure(new Triangle());
        testShapeCollector.addFigure(new Square());

        Assert.assertEquals(testShapeCollector.getFigure(0),testShapeCollector.getFigure(1));
    }




}
