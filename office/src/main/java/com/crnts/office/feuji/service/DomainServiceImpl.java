package com.crnts.office.feuji.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crnts.office.feuji.entity.Domain;
import com.crnts.office.feuji.repository.DomainRepository;
@Service
@Transactional
public class DomainServiceImpl implements DomainService{

	@Autowired
	DomainRepository domainRepository; 
	@Override
	public Domain save(Domain domain) {
		// TODO Auto-generated method stub
		return domainRepository.save(domain);
	}

}
