package com.puneet.transpera.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puneet.transpera.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
   User findByUsername(String username); 
}
