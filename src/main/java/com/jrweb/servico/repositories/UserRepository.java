package com.jrweb.servico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrweb.servico.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
