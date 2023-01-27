package com.tink.demo.services;

import java.util.List;

import com.tink.demo.entities.Logs;


public interface LogsService {
	
	Logs saveLog(Logs log);
	Logs updateLog(Logs log);
	void deleteLog(Logs log);
	void deleteLogById(Long id);
	Logs getLog(Long id);
	List<Logs> getAllLogs();
}
