package com.kodilla.testing.shape;

import java.util.Objects;

public abstract class Square implements Shape {
    private String ShapeName = "Square";
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
