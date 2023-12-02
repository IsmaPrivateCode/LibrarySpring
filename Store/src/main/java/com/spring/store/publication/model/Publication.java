package com.spring.store.publication.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Publication {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private LocalDate publicationDate;
	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Publication(Long id, String name, LocalDate publicationDate) {
		super();
		this.id = id;
		this.name = name;
		this.publicationDate = publicationDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}
	@Override
	public String toString() {
		return "Publication [id=" + id + ", name=" + name + ", publicationDate=" + publicationDate + "]";
	}
	
	
	
}
