package com.Employee.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Employee.demo.Model.*;

public interface DepartmentInterface extends CrudRepository<Department, Long> {
	
}
