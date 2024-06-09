package com.example.THJava.controller;

import com.example.THJava.entity.Book;
import com.example.THJava.sevice.BookSevice;
import com.example.THJava.sevice.CategorySevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookSevice bookService;

    @Autowired
    private CategorySevice categorySevice;

    @GetMapping
    public String showAllBooks(Model model){
        List<Book> books = bookService.GetAllBooks();
        model.addAttribute("books", books);
        return "book/list";
    }
    @GetMapping("/add")
    public String addBookForm(Model model){
        model.addAttribute("book", new Book());
        model.addAttribute("category", categorySevice.getAllCategories());
        return "book/add";
    }

    @PostMapping("/add")
    public String addbook(@ModelAttribute("book") Book book){
        bookService.addBook(book);
        return "redirect:/books";
    }
}
