package com.tink.demo.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tink.demo.entities.Profils;
import com.tink.demo.repositories.ProfilsRepository;
import com.tink.demo.services.ProfilsService;


@Service
public class ProfilsServiceImpl implements ProfilsService {

	@Autowired
	ProfilsRepository profilsRepo;
	
	@Override
	public Profils saveProfil(Profils Profil) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profils updateProfil(Profils Profil) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProfil(Profils Profil) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfilById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Profils getLogin(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profils> getAllProfils() {
		// TODO Auto-generated method stub
		return profilsRepo.findAll();
	}

}
