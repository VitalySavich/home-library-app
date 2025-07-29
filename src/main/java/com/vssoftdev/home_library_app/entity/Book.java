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

    public Book(String name, String author, String published, String year, String city) {
        this.name = name;
        this.author = author;
        this.published = published;
        this.year = year;
        this.city = city;
    }

    private String name;
    private String author;
    private String published;
    private String year;
    private String city;

}
