package com.group.libraryapp.repository.book;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BookMemoryRepository implements BookRepository {
    //private final List<Book> books = new ArrayList<Book>();

    public void saveBook(){
        //books.add(new Book());
        System.out.println("TESTTEST");
    }

}
