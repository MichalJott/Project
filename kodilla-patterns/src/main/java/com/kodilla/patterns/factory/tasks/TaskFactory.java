package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "Shopping Task";
    public static final String DRIVINGTASK = "Driving Task";
    public static final String PAINTINGTASK = "Painting Task";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Healthy shop", "guarana", 2.0);
            case DRIVINGTASK:
                return new DrivingTask("driving", "highway", "car");
            case PAINTINGTASK:
                return new PaintingTask("paint", "black", "chair");
            default:
                return null;
        }
    }
}