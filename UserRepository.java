package com.investapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.investapp.entity.User;



public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
}
