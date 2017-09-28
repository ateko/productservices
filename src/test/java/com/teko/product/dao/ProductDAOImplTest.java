package com.teko.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.teko.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("iPhone");
		product.setDescription("Spartphone Apple");
		product.setPrice(120);
		
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("iPhone", product.getName());
		
	}

}
