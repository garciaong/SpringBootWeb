package com.springboot.web.mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.mvc.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
	
	public List<Product> findByName(String name);
	
}
