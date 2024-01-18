package com.springmvc.service;

import com.springmvc.bean.DomainBean;
import com.springmvc.entity.Domain;

public interface DomainService {

	Domain save(DomainBean domain);
	void update(DomainBean domain);
	void delete(DomainBean domain);
}
