package com.kodilla.testing.shape;

import java.util.Objects;

public abstract class Triangle implements Shape {
    private String ShapeName = "Triangle";
    private int field = 64;

    @Override
    public String getShapeName() {
        return ShapeName;
    }

    @Override
    public int getField() {
        return field;

    }
}
