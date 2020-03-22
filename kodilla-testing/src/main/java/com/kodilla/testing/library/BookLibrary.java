package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase){
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment){
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("Bond", "James Ben", 2000);
        Book book1 = new Book("Bond", "James Ben", 2000);
        Book book2= new Book("Bond", "James Ben", 2000);
        Book book3 = new Book("Bond", "James Ben", 2000);


        bookList.add(book);

        // tymczasowo zwraca liste ksiazek
        return  bookList;
    }

}
