package com.example.book;

import com.example.book.model.Book;
import com.example.book.repository.BookRepository;
import com.example.book.service.BookServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class BookServiceImplTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookServiceImpl bookService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllBooks() {
        // Given
        List<Book> books = Arrays.asList(
                new Book("123", "Title1", "Author1"),
                new Book("456", "Title2", "Author2")
        );
        when(bookRepository.findAll()).thenReturn(books);

        // When
        List<Book> result = bookService.getAllBooks();

        // Then
        assertEquals(2, result.size());
        assertEquals("123", result.get(0).getIsbn());
    }
}