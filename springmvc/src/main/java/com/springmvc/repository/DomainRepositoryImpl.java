package com.springmvc.repository;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.bean.DomainBean;
import com.springmvc.entity.Domain;

@Repository
public class DomainRepositoryImpl implements DomainRepository{

	@Autowired
	 HibernateTemplate hibernateTemplate; 
	@Override
	public Domain save(Domain domain) {
		System.out.println(domain);
		hibernateTemplate.save(domain);
		return domain;
	}
	@Override
	public void update(Domain domain) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(domain);
	}
	@Override
	public void delete(Domain domain) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(domain);
	}

}
