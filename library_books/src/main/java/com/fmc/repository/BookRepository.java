package com.fmc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.beans.Books;

public interface BookRepository extends JpaRepository<Books, Integer> {
	List<Books>findAllBooksById(Integer id);
}
