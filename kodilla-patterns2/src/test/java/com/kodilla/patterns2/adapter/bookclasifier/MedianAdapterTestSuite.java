package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite {


    @Test
    public void publicationYearMedianTest() {

        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Jonasz Fik", "Grota", 2000, "1"));
        books.add(new Book("Jonasz Fik", "Moje życzenie", 2007, "2"));
        books.add(new Book("Jonasz Fik", "Fake it till You make it", 2007, "3"));
        books.add(new Book("Jonasz Fik", "Wiesz, że możesz", 2000, "4"));
        books.add(new Book("Jonasz Fik", "Szybki wiatr", 1999, "5"));
        books.add(new Book("Jonasz Fik", "Sukces", 1998, "6"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(2000, median, 0);
    }
}