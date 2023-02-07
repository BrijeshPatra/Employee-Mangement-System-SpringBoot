package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<String, Integer>{
	
}
