package com.tink.demo.services;

import java.util.List;

import com.tink.demo.entities.Users;

public interface UsersService {
	
	Users saveUser(Users user);
	Users updateUser(Users user);
	void deleteUser(Users user);
	void deleteUserById(Long id);
	Users getUser(Long id);
	List<Users> getAllUsers();
	
}
