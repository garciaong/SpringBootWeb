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
	
	private List<Product> mockData(){
		List<Product> products = new ArrayList<Product>();
		Product product1 = new Product();
		product1.setId(new Integer(1));
		product1.setName("First");
		product1.setDescription("First Item");
		products.add(product1);
		
		Product product2 = new Product();
		product2.setId(new Integer(2));
		product2.setName("Second");
		product2.setDescription("Second Item");
		products.add(product2);
		
		return products;
	}
}
