package com.project.lms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.model.Batch;

public interface batchRepository extends MongoRepository<Batch, String> {

}
