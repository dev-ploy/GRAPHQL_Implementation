package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.graphql.test.autoconfigure.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

import static org.junit.jupiter.api.Assertions.*;
@GraphQlTest(BookController.class)
class BookControllerTest {
    @Autowired
    private GraphQlTester  graphQlTester;
    @Test
    void canGetbooks() {
        graphQlTester.documentName("books")
                .execute()
                .path("books")
                .entityList(Book.class)
                .hasSize(4);
    }
}