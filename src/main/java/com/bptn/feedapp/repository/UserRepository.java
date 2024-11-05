package com.bptn.feedapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bptn.feedapp.jpa.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	
}
