package com.crnts.office.feuji.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.crnts.office.feuji.entity.Domain;
@Repository
public class DomainRepositoryImpl implements DomainRepository{

	@Autowired
	HibernateTemplate hibernateTemplate; 
	@Override
	public Domain save(Domain domain) {
		// TODO Auto-generated method stub
		System.out.println(domain);
		hibernateTemplate.save(domain);
		return domain;
	}

}
