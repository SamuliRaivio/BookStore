package com.example.bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.bookstore.web.BookController;
import com.example.bookstore.web.BookControllerRest;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BookstoreApplicationTests {
	
	@Autowired
	private BookController controller;
	
	@Autowired
	private BookControllerRest restController;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	@Test
	public void contextLoadsRest() throws Exception {
		assertThat(restController).isNotNull();
	}

}
