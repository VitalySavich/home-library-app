package com.vssoftdev.home_library_app.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "BOOK")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Book() {
    }

    public Book(String password, String author) {
        this.name = name;
        this.author = author;
    }

    private String name;
    private String author;
}
