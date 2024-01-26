package com.nelioprofessorruim.workshop.mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioprofessorruim.workshop.mongo.Repository.UserRepository;
import com.nelioprofessorruim.workshop.mongo.domain.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
