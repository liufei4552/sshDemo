package com.ssh.dao;

import com.ssh.bean.Product;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public interface ProductDao{
	/**
	 * 添加信息
	 * @param product
	 */
		void saveProduct(Product product);

	/**
	 * 修改信息
	 * @param product
	 */
		void updateProduct(Product product);

	/**
	 * 根据id查询信息
	 * @param id
	 * @return
	 */
		Product findProduct(int id);

	/**
	 * 查询所有信息
	 * @return
	 */
		List<Product>findAllProduct();

	/**
	 * 查询所有信息总数
	 * @return
	 */
	long findAllCount();
	/**
	 * 删除信息
	 * @param product
	 */
		void deleProduct(Product product);

	/**
	 * 分页查询信息
	 * @param page
	 * @return
	 */
		List<Product> findInforByPage(int page, int pagesize);
}
