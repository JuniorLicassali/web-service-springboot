package com.jrweb.servico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrweb.servico.entities.User;
import com.jrweb.servico.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		java.util.Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
}
