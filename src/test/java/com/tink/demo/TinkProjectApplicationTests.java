package com.tink.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tink.demo.entities.Profils;
import com.tink.demo.entities.Users;
import com.tink.demo.repositories.ProfilsRepository;
import com.tink.demo.repositories.UsersRepository;

@SpringBootTest
class TinkProjectApplicationTests {

	@Autowired
	private UsersRepository userRepository;
	
	@Autowired
	private ProfilsRepository profilsRepository;
	@Test
	public void testCreateUser() {
		
		//String firstName, String lastName, String email, Date dateOfBirth, Date creationDate,Date validityDate, String phoneNumber
		Users user = new Users("Maymoun","EL FAHIM","maymoun.elfahim@gmail.com",new Date(99, 7, 17) ,new Date(),new Date(),"0611461955","M");
		userRepository.save(user);
	}
	
	@Test
	public void testFindUser()
	{
		Users user = userRepository.findById(1L).get();
		System.out.println(user);
	}
	
	@Test
	public void testUpdateUser() {
		Users user = userRepository.findById(1L).get();
		user.setFirstName("Hssaine");
		user.setLastName("Abicha");
		user.setEmail("hssaine.abicha@gmail.com");
		user.setGender("MF");
		userRepository.save(user);
	}
	
	@Test
	public void testDeleteUser() {
		userRepository.deleteById(2L);
		
	}
	
	@Test
	public void testFindAllUser() {
		
		List<Users> users = userRepository.findAll();
		
		for(Users user: users) {
			System.out.println(user);
			
		}
 	}
	
	@Test
	public void testCreateProfils() {
		
		List<String> listOfProfil = new ArrayList<>();
		listOfProfil.add("Administrateur");
		listOfProfil.add("Valideur");
		listOfProfil.add("Utiliateur");
		listOfProfil.forEach(p -> {
			profilsRepository.save(new Profils(p ,"Description "+ p));
		});
		
		
	}
	
	@Test
	public void testGetProfils() {
		
		List<Profils> listOfProfil = new ArrayList<>();
		listOfProfil = profilsRepository.findBTypeDescriptionV2("Administrateur","Administrateur");
		listOfProfil.forEach(p -> {
			System.out.println(p);
		});
		
		
	}
	@Test
	public void testGetAllProfils() {
		
		List<Profils> listOfProfil = new ArrayList<>();
		listOfProfil = profilsRepository.findAll();
		listOfProfil.forEach(p -> {
			System.out.println(p);
		});
		
		
	}
	@Test
	public void testGetProfilsByOrderByTypeAsc() {
		List<Profils> listProfils = new ArrayList<>();
		listProfils = profilsRepository.findByOrderByTypeAsc();
		listProfils.forEach(p ->{
			System.out.println(p);
		});
	}
}
