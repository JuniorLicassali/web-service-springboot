package com.jrweb.servico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrweb.servico.entities.Category;
import com.jrweb.servico.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		java.util.Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
