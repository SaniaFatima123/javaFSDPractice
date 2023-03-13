package com.example.bookms.repository;

import com.example.bookms.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookMongoRepository extends MongoRepository<Book, String> {
    List<Book> findByName(String name);
    List<Book> findByNameAndAuthor(String name,String author);
}
