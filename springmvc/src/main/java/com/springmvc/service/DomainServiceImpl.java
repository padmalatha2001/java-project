package com.springmvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.bean.DomainBean;
import com.springmvc.entity.Domain;
import com.springmvc.repository.DomainRepository;


@Service
@Transactional
public class DomainServiceImpl implements DomainService{

	@Autowired
	DomainRepository domainRepository; 
	
	
	@Override
	public Domain save(DomainBean domain) {
		// TODO Auto-generated method stub
		Domain entity=new Domain();
		entity.setId(domain.getId());
		entity.setName(domain.getName());
		entity.setEmployee_count(domain.getEmployee_count());
		return domainRepository.save(entity);
	}


	@Override
	public void update(DomainBean domain) {
		// TODO Auto-generated method stub
		Domain entity=new Domain();
		entity.setId(domain.getId());
		entity.setName(domain.getName());
		entity.setEmployee_count(domain.getEmployee_count());
		domainRepository.update(entity);
		
	}


	@Override
	public void delete(DomainBean domain) {
		// TODO Auto-generated method stub
		Domain entity=new Domain();
		entity.setId(domain.getId());
		domainRepository.delete(entity);
	}

}
