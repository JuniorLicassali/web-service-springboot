package com.jrweb.servico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrweb.servico.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
