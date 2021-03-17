package com.example.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import com.example.bookstore.domain.BookRepository;


import com.example.bookstore.domain.Book;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BookRepositoryTest {
	
	@Autowired
	private BookRepository repository;
	
	@Test
	public void findByTitleShouldReturnBook( ) {
		List<Book> books = repository.findByTitle("Rumo");
		
		assertThat(books).hasSize(1);
		assertThat(books.get(0).getAuthor()).isEqualTo("Walter Moers");
	}
	
	@Test
    public void createNewBook() {
    	Book book = new Book("Testauskirja", "Testauskirjailija", "1", "testiISBN", 1.0, null);
    	repository.save(book);
    	assertThat(book.getId()).isNotNull();
    }
	
	@Test
	public void DeleteNewBook() {
		Book book = new Book("Testauskirja", "Testauskirjailija", "1", "testiISBN", 1.0, null);
    	repository.save(book);
    	repository.deleteById(book.getId());
	}

}
