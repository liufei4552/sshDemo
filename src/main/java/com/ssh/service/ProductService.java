package com.ssh.service;

import com.ssh.bean.Product;

public interface ProductService {
	void saveProduct(Product product);
	/**
	 * 修改信息
	 * @param product
	 */
	void updateProduct(Product product);
}
