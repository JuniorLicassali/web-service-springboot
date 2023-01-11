package com.jrweb.servico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrweb.servico.entities.Order;
import com.jrweb.servico.repositories.OrderRepository;

@Service
public class OrderService {

	
	@Autowired
	private OrderRepository repository;
		
	public List<Order> findAll() {
		return repository.findAll();
	}
		
	public Order findById(Long id) {
		java.util.Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
