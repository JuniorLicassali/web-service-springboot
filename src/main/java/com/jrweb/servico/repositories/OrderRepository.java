package com.jrweb.servico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrweb.servico.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
