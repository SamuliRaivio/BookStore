package com.example.bookstore.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bookstore.domain.Book;

@Controller
public class BookController {
	
	private List<Book> books = new ArrayList<Book>();
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getIndex() {
		
		return "index";
		 
	}
	

}
