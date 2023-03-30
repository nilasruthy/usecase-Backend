package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;

@RestController
@RequestMapping ("/book")
@CrossOrigin("*")
public class BookController {
	  @Autowired
	  private BookService bookService ;
	  
//		@Autowired
//		private BookRepository bookRepository;
	    
	    // create rest api 
	    
	    public BookController(BookService bookService) {
			super();
			this.bookService = bookService;
		}

		@PostMapping()
	    public ResponseEntity<Book> saveBook(@RequestBody Book member) {
	        
	        return new ResponseEntity<Book> (bookService.saveBook(member), HttpStatus.CREATED);
	        
	    }
	    
	    // get all api 
	    
	    @GetMapping
	    public List<Book> getAllmember () {
	        return bookService.getAllbook();
	    }
	    
	    // get by id 
	    
	    @GetMapping ("{id}")
	    public ResponseEntity<Book> getBookById (@PathVariable ("id") Long id) {
	        return new ResponseEntity<Book> (bookService.getBookById(id), HttpStatus.OK);
	    }
	    

	    
	    @GetMapping("/title/{title}")
	    public List<Book> getBookByTitle(@PathVariable ("title") String book_title) {
	        return bookService.getByTitle(book_title);
	    }
	    
	    @GetMapping("/author/{author}")
	    public List<Book> getBookByAuthor(@PathVariable ("author") String author) {
	        return bookService.getByAuthor(author);
	    }
	    
	    @GetMapping("/category/{category}")
	    public List<Book> getBookByCategory(@PathVariable ("category") String category) {
	        return bookService.getByCategory(category);
	    }
	    
	    @GetMapping("/keyword/{keyword}")
	    public List<Book> getBookByKeyword(@PathVariable ("keyword") String keyword) {
	        return bookService.getByKeyword(keyword);
	    }
	    
	    
	    
	    // update by id 
	    
	    @PutMapping ("{id}")
	    public ResponseEntity<Book> updateBook(@PathVariable ("id") Long id , @RequestBody Book member) {
	        return new ResponseEntity<Book> (bookService.updateBook(member, id), HttpStatus.OK);
	    }
	    
	    // delete api by id
	    
       @DeleteMapping ("{id}")
	        public ResponseEntity<String> deleteBook(@PathVariable ("id") Long id) {
	        	bookService.deleteBook(id);
	            return new ResponseEntity <String> ("Docter info deleted" , HttpStatus.OK);
	        }
}
