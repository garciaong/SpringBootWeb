package com.springboot.web.mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.mvc.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

	public List<User> findByUsername(String username);
	
}
