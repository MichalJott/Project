package com.kodilla.testing.shape;

public interface Shape {

    String ShapeName();
    Integer Field();


    default String getShapeName() {
        return ShapeName();

    }

    default int getField() {
        return Field();

    }


}
