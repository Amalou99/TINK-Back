package com.tink.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Profils {
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String type;
	private String description;
	
	@OneToOne (mappedBy = "profil")
	private Users user;

	public Profils(String type, String description) {
		super();
		this.type = type;
		this.description = description;
		
	}
	
	
}
