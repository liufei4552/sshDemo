package com.ssh.dao.impl;

import com.ssh.bean.Product;
import com.ssh.dao.ProductDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class ProductDaoImplTest {
	@Autowired
	private ProductDao dao;
	/*@Test
	public void saveProduct() {
		Product product=new Product();
		product.setName("钢笔");
		product.setPrice(32);
		dao.saveProduct(product);
	}*/
	/*@Test
	public void updateProduct(){
		Product product=new Product();
		product.setId(3);
		product.setName("水笔");
		product.setPrice(13);
		dao.updateProduct(product);
	}*/
	/*@Test
	public void findProduct(){
		Product product=dao.findProduct(1);
		System.out.println(product);
	}*/
	@Test
	public void findAllProduct(){
		List<Product>list=dao.findAllProduct();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}