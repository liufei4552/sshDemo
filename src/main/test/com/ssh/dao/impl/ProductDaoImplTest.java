package com.ssh.dao.impl;

import com.ssh.bean.Product;
import com.ssh.dao.ProductDao;
import org.hibernate.Session;
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
	/**
	 * 插入信息
	 */
	/*@Test
	public void saveProduct() {
		Product product=new Product();
		product.setName("钢笔");
		product.setPrice(32);
		dao.saveProduct(product);
	}*/
	/**
	 * 修改信息
	 */
	/*@Test
	public void updateProduct(){
		Product product=new Product();
		product.setId(3);
		product.setName("水笔");
		product.setPrice(13);
		dao.updateProduct(product);
	}*/
	/**
	 * 根据id查询信息
	 */
	/*@Test
	public void findProduct(){
		Product product=dao.findProduct(1);
		System.out.println(product);
	}*/
	/**
	 * 查询信息
	 */
	/*@Test
	public void findAllProduct(){
		List<Product>list=dao.findAllProduct();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}*/
	/**
	 * 删除信息
	 */
	/*@Test
	public void deleProduct(){
		Product product=new Product();
		product.setId(4);
		dao.deleProduct(product);
	}*/
	/**
	 * 查询所有信息总数
	 */
	/*@Test
	public void findAllCount(){
		long v=dao.findAllCount();
		System.out.println(v);
	}*/

	/**
	 * 分页查询
	 */
	@Test
	public void findInforByPage(){
		List<Product>list=dao.findInforByPage(1, 1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}