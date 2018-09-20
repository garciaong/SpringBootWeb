package com.springboot.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.mvc.entity.Product;
import com.springboot.web.mvc.repository.UserRepository;

@Service
public class UserService {

	@Autowired
    private UserRepository repo;
	
	@Autowired
	private ProductService products;
	
	public UserService(ProductService products) {
        super();
        this.products = products;
    }
	
	public List<Product> getAllProducts() {
		return products.getAllProducts();
	}
}
