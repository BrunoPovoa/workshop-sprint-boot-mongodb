package com.nelioprofessorruim.workshop.mongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioprofessorruim.workshop.mongo.Repository.PostRepository;
import com.nelioprofessorruim.workshop.mongo.domain.Post;
import com.nelioprofessorruim.workshop.mongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
	
}
