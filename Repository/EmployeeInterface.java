package com.Employee.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.Employee.demo.Model.*;

import antlr.collections.List;

public interface EmployeeInterface extends JpaRepository<Employee,Long> {
	
	
	List findAllById(@Param("id")Long id);



}

