package com.tink.demo.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tink.demo.entities.Users;
import com.tink.demo.repositories.UsersRepository;
import com.tink.demo.services.UsersService;
@Service
public class UsersServiceImpl implements UsersService {
	
	
	@Autowired
	private UsersRepository userRepository;
	
	@Override
	public Users saveUser(Users user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public Users updateUser(Users user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Users user) {
		// TODO Auto-generated method stub
		userRepository.delete(user);
		
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public Users getUser(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
