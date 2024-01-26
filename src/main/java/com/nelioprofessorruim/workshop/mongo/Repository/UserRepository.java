package com.nelioprofessorruim.workshop.mongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioprofessorruim.workshop.mongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
