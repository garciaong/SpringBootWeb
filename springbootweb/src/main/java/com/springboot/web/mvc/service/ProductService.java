package com.springboot.web.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.springboot.web.mvc.entity.Product;
import com.springboot.web.mvc.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
    private ProductRepository repo;
	
	public List<Product> getAllProducts() {
		//return mockData();
		return Lists.newArrayList(repo.findAll());
	}
}
