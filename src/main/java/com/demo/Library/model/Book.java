package com.demo.Library.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="books")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private String isbn;
}
