package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LernerTasksTestSuite {

    @Test
    public void testUpdate() {
        //Given
        LernerTasks jannowak = new LernerTasks("Nowak");
        LernerTasks mariuszfot = new LernerTasks("Fot");
        Mentor tomaszfik = new Mentor("Tomasz", "Fik");
        Mentor robertfog = new Mentor("Robert", "Fog");
        jannowak.registerObserver(tomaszfik);
        mariuszfot.registerObserver(robertfog);

        //when
        jannowak.addTask("Utworz interfejs");
        jannowak.addTask("Podaj liczbę Design patterns");
        jannowak.addTask("Wylicz wysokość");
        mariuszfot.addTask("Wylicz wzrost");
        //then
        assertEquals(3, jannowak.getUpdateCount());
        assertEquals(1, mariuszfot.getUpdateCount());
    }
}