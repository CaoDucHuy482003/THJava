package com.example.THJava.repository;

import com.example.THJava.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository


    public interface IBookRepository extends JpaRepository<Book, Long> {

    }
