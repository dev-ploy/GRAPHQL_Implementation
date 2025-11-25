package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {
    public static List<Author> authors= Arrays.asList(
            new Author(1,"Almighty Father"),
            new Author(2,"Valmiki"),
            new Author(3,"Mama Samba"),
            new Author(4,"JK Rowling")
    );
    public static Optional<Author> getAuthorByID(Integer id){
        return authors.stream()
                .filter(author -> author.id.equals(id))
                .findFirst();
    }
}
