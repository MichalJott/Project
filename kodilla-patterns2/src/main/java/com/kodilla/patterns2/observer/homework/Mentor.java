package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String firstName;
    private final String lastName;

    public Mentor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void update(LernerTasks lernerTasks) {
        System.out.println("Nowe zadanie! \nAktualnie " + lernerTasks.getLernerName() + " ma na liście "
                + lernerTasks.getTasks().size() + " zadań");
    }
}
