package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String ShapeName = "Square";
    private int Field = 64;


    @Override
    public String getShapeName() {
        return ShapeName;
    }

    @Override
    public int getField() {
        return Field;
    }
}