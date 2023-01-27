package com.tink.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tink.demo.entities.Profils;
import com.tink.demo.services.ProfilsService;



@RestController
@RequestMapping("/profils")
@CrossOrigin
public class ProfilController {
	
	@Autowired
	ProfilsService profilsServ;
	
	@RequestMapping (method = RequestMethod.GET)
	public List<Profils> getAllProfils(){
		
		return profilsServ.getAllProfils();
		
	}

}
