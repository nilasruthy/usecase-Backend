package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;


@Repository
public interface BookRepository extends JpaRepository <Book,Long> {
	@Query(nativeQuery= true, value="SELECT * FROM book WHERE book_title = ?1")
	List<Book> getByTitle(@Param ("book_title") String book_title);
	
	@Query(nativeQuery= true, value="SELECT * FROM book WHERE author = ?1")
	List<Book> getByAuthor(@Param ("author") String author);
	
	@Query(nativeQuery= true, value="SELECT * FROM book WHERE category = ?1")
	List<Book> getByCategory(@Param ("category") String category);
	
	@Query(nativeQuery= true, value="SELECT * FROM book WHERE keyword = ?1")
	List<Book> getByKeyword(@Param ("keyword") String keyword);
	
}
