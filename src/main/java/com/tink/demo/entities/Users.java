package com.tink.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity
public class Users {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idUser;
	private String firstName;
	private String lastName;
	private String email;
	private Date dateOfBirth;
	private Date creationDate;
	private Date validityDate;
	private String phoneNumber;
	private String gender;
	private Long age;
	
	@OneToMany (mappedBy = "user")
	private List<Logins> logins;
	
	@OneToOne 
	private Profils profil;
	
	
	public Users(String firstName, String lastName, String email, Date dateOfBirth, Date creationDate,
			Date validityDate, String phoneNumber, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.creationDate = creationDate;
		this.validityDate = validityDate;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		
	}
	
	
	public Users(String firstName, String lastName, String email, Date dateOfBirth, Date creationDate,
			String phoneNumber, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.creationDate = creationDate;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
	}

	
}
