package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id, String name, Integer pageCount,Integer authorId){
    public static List<Book> books= Arrays.asList(
            new Book(1,"Bible",670,1),
            new Book(2,"Bhagwad Gita",1200,2),
            new Book(3,"Quran",604,3),
            new Book(4,"Harry Potter",700,4)
    );
    public static Optional<Book> getBookById(Integer id){
        return books.stream()
                .filter(book -> book.id.equals(id))
                .findFirst();
    }
}
