package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private String ShapeName = "Circle";
    private int Field = 32;


    @Override
    public String getShapeName() {
        return ShapeName;
    }

    @Override
    public int getField() {
        return Field;
    }
}
