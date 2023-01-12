package com.jrweb.servico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrweb.servico.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
