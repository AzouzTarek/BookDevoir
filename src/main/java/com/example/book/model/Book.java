package com.example.book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String isbn;
    private String title;
    private String author;
}