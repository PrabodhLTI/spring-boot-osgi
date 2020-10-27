package com.lti.PracticeEcom.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.PracticeEcom.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
 
	User findByUserName(String username);
}
