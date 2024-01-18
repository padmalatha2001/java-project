package com.springmvc.repository;

import com.springmvc.bean.DomainBean;
import com.springmvc.entity.Domain;

public interface DomainRepository {

	Domain save(Domain domain);
	void update(Domain domain);
	void delete(Domain domain);
}
