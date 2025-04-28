package com.fmc.beans;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.ToString;


@Entity
@Data
@ToString(exclude="books")
public class Library {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer li_id;
	private String name;
	
	@OneToMany(mappedBy="library",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Books>books;
	

}
