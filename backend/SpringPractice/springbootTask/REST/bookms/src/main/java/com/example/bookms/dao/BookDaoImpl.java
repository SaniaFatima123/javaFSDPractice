package com.example.bookms.dao;

import com.example.bookms.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class BookDaoImpl implements IBookDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Book save(Book book) {
        Book result = entityManager.merge(book);
        return result;
    }

    @Override
    public Book findById(int id) {
        Book found = entityManager.find(Book.class,id);
        return found;
    }

    @Override
    public List<Book> findByName(String name) {
        String query = "from Book where name=:nameArg";
        TypedQuery<Book> typedQuery=entityManager.createQuery(query,Book.class);
        typedQuery.setParameter("nameArg",name);
       List<Book> foundByName = typedQuery.getResultList();
        return foundByName;
    }

    @Override
    public List<Book> findAll() {
        String query = "from Book";
        TypedQuery<Book> typedQuery=entityManager.createQuery(query,Book.class);
        List<Book> foundAll = typedQuery.getResultList();
        return foundAll;
    }

    @Override
    public String delete(Book book) {
        entityManager.remove(book);
        return "removed with id "+book.getId();
    }
}
