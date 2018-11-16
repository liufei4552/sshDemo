package com.ssh.dao.impl;

import com.ssh.bean.Product;
import com.ssh.dao.ProductDao;
import com.ssh.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

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

	@Override
	@Transactional(readOnly = false)
	public void deleProduct(Product product) {
		hibernateTemplate.delete(product);
	}

	@Override
	public long findAllCount() {
		String sql="select count(*) from com.ssh.bean.Product";
		return (Long) hibernateTemplate.find(sql).listIterator().next();
	}

	@Override
	public List<Product> findInforByPage(int page,int pagesize) {
		List<Product>list=PageUtil.getListByPage(this.getHibernateTemplate(),page, pagesize, Product.class);
		return list;
	}
}
