package com.altimetrik.graphql.repository;

import com.altimetrik.graphql.bookinfo.Book;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BookRepository extends JpaRepository<Book, String> {
}
