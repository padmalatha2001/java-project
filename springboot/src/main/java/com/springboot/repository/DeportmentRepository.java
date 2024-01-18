package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.*;

@Repository
public interface DeportmentRepository extends JpaRepository<Department,Long>{
     public Department findByName(String name);
}
