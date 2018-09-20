package com.springboot.web.mvc;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.web.mvc.entity.Product;
import com.springboot.web.mvc.service.ProductService;
import com.springboot.web.mvc.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWebApplicationTests {

	@MockBean
	ProductService productService;
	
	@Test
	public void getAllProducts() {
		when(productService.getAllProducts()).thenReturn(getMockProducts());
		assertEquals(2, productService.getAllProducts().size());
	}
	
	@Test
	public void getAllProductsByUser() {
		when(productService.getAllProducts()).thenReturn(getMockProducts());
		UserService userSerivce = new UserService(productService);
		assertEquals(2, userSerivce.getAllProducts().size());
	}
	
	private List<Product> getMockProducts(){
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
