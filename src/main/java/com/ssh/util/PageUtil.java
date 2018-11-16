package com.ssh.util;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class PageUtil {
	/**
	 * 分页查询类
	 * @param hibernateTemplate
	 * @param page 第几页
	 * @param pagesize 每页的个数
	 * @param clazz 查询的实体类
	 * @return
	 */
	public static  List getListByPage(HibernateTemplate hibernateTemplate,int page,int pagesize,Class clazz){
		DetachedCriteria criteria=DetachedCriteria.forClass(clazz);
		int startPosition=(page-1)*pagesize;
		List list=(List)hibernateTemplate.findByCriteria(criteria, startPosition, pagesize);
		return list;
	}
}
