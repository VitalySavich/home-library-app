package com.vssoftdev.home_library_app.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vssoftdev.home_library_app.entity.Book;
import com.vssoftdev.home_library_app.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;
    private final ObjectMapper objectMapper;

    @GetMapping("/api/main")
    public String mainListener(){
        return "Home Library App";
    }

    @GetMapping("/api/book")
    public String getBook(@RequestParam int id) throws JsonProcessingException {
        log.info("Get Book By Id Operation");

        Optional<Book> book = bookRepository.findById(id);
        return objectMapper.writeValueAsString(book);
    }

    @GetMapping("/api/book/all")
    public List<Book> getAllBooks() {
        log.info("Get All Books Operation");
        return bookRepository.findAll();
    }

    @PostMapping("/api/book/create")
    public Book createBook(@RequestBody Book book){
        log.info("Create Book Operation");

        return bookRepository.save(book);
    }

    @DeleteMapping("/api/book")
    public void deleteBook(@RequestParam int id) {
        log.info("Delete Book By Id Operation");
        bookRepository.deleteById(id);
    }

    @PutMapping("/api/book/update")
    public Book updateBook(@RequestBody Book book){
        log.info("Update Book Operation");
        if (!bookRepository.existsById(book.getId())) {
            return null;
        }
        return bookRepository.save(book);
    }

}
