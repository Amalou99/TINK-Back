package com.tink.demo.services;

import java.util.List;

import com.tink.demo.entities.Profils;


public interface ProfilsService {
	
	
	Profils saveProfil(Profils Profil);
	Profils updateProfil(Profils Profil);
	void deleteProfil(Profils Profil);
	void deleteProfilById(Long id);
	Profils getLogin(Long id);
	List<Profils> getAllProfils();
}
