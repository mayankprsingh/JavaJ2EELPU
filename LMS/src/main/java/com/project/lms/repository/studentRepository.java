package com.project.lms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.model.Student;

public interface studentRepository extends MongoRepository<Student, String>{

}
