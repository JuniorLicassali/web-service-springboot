package com.jrweb.servico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrweb.servico.entities.Product;
import com.jrweb.servico.repositories.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
	private ProductRepository repository;
		
	public List<Product> findAll() {
		return repository.findAll();
	}
		
	public Product findById(Long id) {
		java.util.Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
