package com.ssh.service.impl;

import com.ssh.bean.Product;
import com.ssh.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring.xml"} )
public class ProductServiceImplTest {
	@Autowired
	private ProductService service;
	@Test
	public void updateProduct() {
		Product product=new Product();
		product.setId(2);
		product.setName("毛笔");
		product.setPrice(10);
		service.updateProduct(product);
	}
}