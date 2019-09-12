package com.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	public User findOneByName(String name);

}
