package com.fmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.beans.Library;

public interface LibraryRepository extends JpaRepository<Library, Integer>{

	

}
