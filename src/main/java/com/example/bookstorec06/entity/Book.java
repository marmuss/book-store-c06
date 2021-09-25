package com.example.bookstorec06.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    private long id;
    private String title;
    private String author;
    private String description;
    private String year;
    private String publisher;
    private int quantity;
}