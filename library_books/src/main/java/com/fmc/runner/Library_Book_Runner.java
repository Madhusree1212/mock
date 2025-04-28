package com.fmc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fmc.beans.Books;
import com.fmc.beans.Library;
import com.fmc.repository.BookRepository;
import com.fmc.repository.LibraryRepository;



@Component
public class Library_Book_Runner  implements CommandLineRunner{
	
	
	@Autowired
	private LibraryRepository libraryRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
	// here i am creating library beans
		Library l1=new Library();
		l1.setName("Sv");
		
		
	// Here i am creating Book beans
		Books b1=new Books();
		b1.setName("physics");
		b1.setIsbn("school");
		b1.setLibrary(l1);
		
		Books b2=new Books();
		b2.setName("anasthesia");
		b2.setIsbn("diploma");
		b2.setLibrary(l1);
		
		Books b3=new Books();
		b3.setName("maths");
		b3.setIsbn("inter");
		b3.setLibrary(l1);
				
	
	//saving the values in library repository
		libraryRepository.save(l1);

	//saving the values in books repository
		bookRepository.save(b1);
		bookRepository.save(b2);
		bookRepository.save(b3);
		
	// finding  books by using id
		bookRepository.findAll().forEach(System.out::println);
		bookRepository.findAllBooksById(b1.getId()).forEach(System.out::println);
		/*
		 * // finding all books by id
		 * libraryRepository.findAll().forEach(System.out::println);
		 */

	}

}
