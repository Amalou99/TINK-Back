package com.tink.demo.entities;

import java.util.Date;

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
public class Logs {
	
	@Id @GeneratedValue (strategy =GenerationType.IDENTITY )
	private Long id;
	private Date loginTime;
	private Date logoutTime;
	
	
	@OneToOne (mappedBy = "log")
	private Logins login;
}
