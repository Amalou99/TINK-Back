package com.tink.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tink.demo.entities.Logins;

public interface LoginsRepository extends JpaRepository<Logins, Long> {

}
