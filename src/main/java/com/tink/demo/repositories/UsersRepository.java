package com.tink.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tink.demo.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
