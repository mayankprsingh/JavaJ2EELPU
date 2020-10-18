package com.project.lms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.model.Staff;

public interface staffRepository extends MongoRepository<Staff, String>{
	
}
