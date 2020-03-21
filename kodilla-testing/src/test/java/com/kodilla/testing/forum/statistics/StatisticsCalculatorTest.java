package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class StatisticsCalculatorTest {

    private StatisticsCalculator objectCalculator;

    @BeforeEach
    void createStatisticsCalculator() {
        this.objectCalculator = new StatisticsCalculator();
    }

    @Test
    void calculateAdvStatisticsNullUsersNullPostsNullComments() {
        Statistics statistics = mock(Statistics.class);
        Mockito.when(statistics.usersNames()).thenReturn(new ArrayList<String>());
        Mockito.when(statistics.postsCount()).thenReturn(0);
        Mockito.when(statistics.commentsCount()).thenReturn(0);

        assertFalse(this.objectCalculator.calculateAdvStatistics(statistics));
        assertEquals(0, this.objectCalculator.getCommentsNumber());
        assertEquals(0, this.objectCalculator.getPostsNumber());
        assertEquals(0, this.objectCalculator.getUsersNumber());
        assertEquals(0, this.objectCalculator.getAverageCommentsPosts());
        assertEquals(0, this.objectCalculator.getAverageUserComments());
        assertEquals(0, this.objectCalculator.getAverageUserPosts());


    }

    @Test
    void calculateAdvStatisticsHundredUsersNullPostsNullComments() {
        List<String> testList = new LinkedList<String>();
        for (int i = 0; i < 100; i++) {
            testList.add("User" + i);
        }
        Statistics statistics = mock(Statistics.class);
        Mockito.when(statistics.usersNames())
                .thenReturn(testList);
        Mockito.when(statistics.postsCount())
                .thenReturn(0);
        Mockito.when(statistics.commentsCount())
                .thenReturn(0);
        assertFalse(this.objectCalculator.calculateAdvStatistics(statistics));
        assertEquals(100, this.objectCalculator.getUsersNumber());
        assertEquals(0, this.objectCalculator.getCommentsNumber());
        assertEquals(0, this.objectCalculator.getPostsNumber());
        assertEquals(0, this.objectCalculator.getAverageUserComments());
        assertEquals(0, this.objectCalculator.getAverageUserPosts());
        assertEquals(0, this.objectCalculator.getAverageCommentsPosts());


    }

    @Test
    void calculateAdvStatisticsHundredUsersWithPosts() {
        List<String> testList = new LinkedList<String>();
        for (int i = 0; i < 100; i++) {
            testList.add("User" + i);
        }
        Statistics statistics = mock(Statistics.class);
        Mockito.when(statistics.usersNames())
                .thenReturn(testList);
        Mockito.when(statistics.postsCount())
                .thenReturn(1000);
        Mockito.when(statistics.commentsCount())
                .thenReturn(0);
        assertTrue(this.objectCalculator.calculateAdvStatistics(statistics));
        assertEquals(100, this.objectCalculator.getUsersNumber());
        assertEquals(0, this.objectCalculator.getCommentsNumber());
        assertEquals(1000, this.objectCalculator.getPostsNumber());
        assertEquals(0, this.objectCalculator.getAverageUserComments());
        assertEquals(10.0, this.objectCalculator.getAverageUserPosts());
        assertEquals(0, this.objectCalculator.getAverageCommentsPosts());


    }
    @Test
    void calculateAdvStatisticsHundredUsersWithPostsMoreThanComments() {
        List<String> testList = new LinkedList<String>();
        for (int i = 0; i < 100; i++) {
            testList.add("User" + i);
        }
        Statistics statistics = mock(Statistics.class);
        Mockito.when(statistics.usersNames())
                .thenReturn(testList);
        Mockito.when(statistics.postsCount())
                .thenReturn(1000);
        Mockito.when(statistics.commentsCount())
                .thenReturn(100);
        assertTrue(this.objectCalculator.calculateAdvStatistics(statistics));
        assertEquals(100, this.objectCalculator.getUsersNumber());
        assertEquals(100, this.objectCalculator.getCommentsNumber());
        assertEquals(1000, this.objectCalculator.getPostsNumber());
        assertEquals(1.0, this.objectCalculator.getAverageUserComments());
        assertEquals(10.0, this.objectCalculator.getAverageUserPosts());
        assertEquals(0.1, this.objectCalculator.getAverageCommentsPosts());

    }
    @Test
    void calculateAdvStatisticsHundredUsersWithPostsLessThanComments() {
        List<String> testList = new LinkedList<String>();
        for (int i = 0; i < 100; i++) {
            testList.add("User" + i);
        }
        Statistics statistics = mock(Statistics.class);
        Mockito.when(statistics.usersNames())
                .thenReturn(testList);
        Mockito.when(statistics.postsCount())
                .thenReturn(100);
        Mockito.when(statistics.commentsCount())
                .thenReturn(1000);
        assertTrue(this.objectCalculator.calculateAdvStatistics(statistics));
        assertEquals(100, this.objectCalculator.getUsersNumber());
        assertEquals(1000, this.objectCalculator.getCommentsNumber());
        assertEquals(100, this.objectCalculator.getPostsNumber());
        assertEquals(10, this.objectCalculator.getAverageUserComments());
        assertEquals(1.0, this.objectCalculator.getAverageUserPosts());
        assertEquals(10.0, this.objectCalculator.getAverageCommentsPosts());

    }
}