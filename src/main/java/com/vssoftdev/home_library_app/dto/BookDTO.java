package com.vssoftdev.home_library_app.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
public class BookDTO {

    private String name;
    private String author;
    private String published;
    private String year;
    private String city;
}
