package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;



@Service

public class BookServiceImpl implements BookService {
	@Autowired
    private BookRepository bookRepository;
    
    
    public BookServiceImpl(BookRepository bookRepository) {
        super();
        this.bookRepository = bookRepository;
    }


	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}


	@Override
	public List<Book> getAllbook() {
		 return bookRepository.findAll();
	}


	@Override
	public Book getBookById(Long id) {
		Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()) {
            return book.get();
        } else {
            throw new ResourceNotFoundException ("Book" , "BookId" , id);
        }
        }


	@Override
	public Book updateBook(Book book, Long id) {
		Book existingBook = bookRepository.findById(id).orElseThrow (
                () -> new ResourceNotFoundException ("Book" , "BookId" , id));
        
        existingBook.setBookid(book.getBookid());
        existingBook.setBookTitle(book.getBookTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setCategory(book.getCategory());
        existingBook.setKeyword(book.getKeyword());
       
        
        bookRepository.save(existingBook);
        return existingBook;
		
        }


	@Override
	public void deleteBook(Long id) {
		bookRepository.findById(id).orElseThrow (() -> new ResourceNotFoundException ("Member" , "Id" , id));
		bookRepository.deleteById(id);		
	}


	@Override
	public List<Book> getByTitle(String book_title) {
		// TODO Auto-generated method stub
		return bookRepository.getByTitle(book_title) ;

	}


	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookRepository.getByAuthor(author);
	}


	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		return bookRepository.getByCategory(category);
	}


	@Override
	public List<Book> getByKeyword(String keyword) {
		// TODO Auto-generated method stub
		return bookRepository.getByKeyword(keyword);
	}



}

