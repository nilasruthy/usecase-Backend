package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;


public interface BookService {
	    Book saveBook (Book book) ;
	    List <Book> getAllbook();
	    Book getBookById (Long id) ;
//	    List<Book> getBookByTitle(String BookTitle);
	    
	    List<Book> getByTitle(String book_title);
	    List<Book> getByAuthor(String author);
	    List<Book> getByCategory(String category);
	    List<Book> getByKeyword(String keyword);
	    
	    Book updateBook (Book book, Long id);
	    void deleteBook (Long id);
}
