package com.Employee.demo.Service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;

import com.Employee.demo.Model.Employee;
import com.Employee.demo.Repository.EmployeeInterface;

@Component
public class EmployeeService {
	@Autowired
	EmployeeInterface EmpInt;
	
	public void add(Employee emp) {
		EmpInt.save(emp);
	}


	public void getEmp(Long id) {
		// TODO Auto-generated method stub
		EmpInt.findAllById(id);
	}

	
}
