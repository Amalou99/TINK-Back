package com.tink.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity
public class Logins {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long loginID;
	private String username;
	private String password;
	
	@ManyToOne
	private Users user;
	
	@OneToOne
	private Logs log;
	
	
	
	

}
