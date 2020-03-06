package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private String ShapeName = "Triangle";
    private int Field = 128;

    @Override
    public String getShapeName() {
        return ShapeName;
    }

    @Override
    public int getField() {
        return Field;
    }
}