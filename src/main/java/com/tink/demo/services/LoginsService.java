package com.tink.demo.services;

import java.util.List;

import com.tink.demo.entities.Logins;

public interface LoginsService {
	Logins saveLogin(Logins user);
	Logins updateLogin(Logins user);
	void deleteLogin(Logins user);
	void deleteLoginById(Long id);
	Logins getLogin(Long id);
	List<Logins> getAllLogins();
}
