package com.ssh.dao.impl;

import com.ssh.bean.Product;
import com.ssh.dao.ProductDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	/*@Autowired
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}*/
	@Override
	public void saveProduct(Product product) {
		hibernateTemplate.save(product);
	}
	@Transactional(readOnly = false)
	@Override
	public void updateProduct(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	public Product findProduct(int id) {
		return hibernateTemplate.get(Product.class, id);
	}

	@Override
	public List<Product> findAllProduct() {
		List<Product>list=(List<Product>) hibernateTemplate.find("from com.ssh.bean.Product");
		return list;
	}
}
