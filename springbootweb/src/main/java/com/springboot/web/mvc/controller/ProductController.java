package com.springboot.web.mvc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.web.mvc.entity.Product;
import com.springboot.web.mvc.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	Logger log = LoggerFactory.getLogger(ProductController.class);
			
	@Autowired
	private ProductService service;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String getAllProducts(Model model) {
		log.info("Retrieving data from service layer");
		List<Product> products = service.getAllProducts();
		for(Product product:products) {
			log.info("[Name:"+product.getName()+"],[Description:"+product.getDescription()+"]");
		}
		model.addAttribute("products", products);
		return "products";
	}
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public String getAdminAllProducts(Model model) {
		log.info("Retrieving data from service layer");
		List<Product> products = service.getAllProducts();
		for(Product product:products) {
			log.info("[Name:"+product.getName()+"],[Description:"+product.getDescription()+"]");
		}
		model.addAttribute("products", products);
		return "admin_products";
	}
	
}
