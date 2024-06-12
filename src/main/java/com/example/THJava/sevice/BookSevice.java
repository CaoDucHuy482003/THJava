package com.example.THJava.sevice;

import com.example.THJava.entity.Book;
import com.example.THJava.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookSevice {


    @Autowired
    private IBookRepository bookRepository;

/*    public List<Book> GetAllBooks() {
        return bookRepository.findAll();
    }*/

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public void updateBook(Book book) {
        bookRepository.save(book);
    }
}
