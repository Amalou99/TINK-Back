package com.tink.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tink.demo.entities.Logs;

public interface LogsRepository extends JpaRepository<Logs, Long> {

}
