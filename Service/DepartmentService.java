package com.Employee.demo.Service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;

import com.Employee.demo.Model.Department;
import com.Employee.demo.Model.Employee;
import com.Employee.demo.Repository.DepartmentInterface;

@Component
public class DepartmentService {
	@Autowired
	DepartmentInterface DeptInt;
	
	public void add(Department Dpt) {
		DeptInt.save(Dpt);
	}
	
	public void delete(Department Dpt) {
		DeptInt.deleteById(Dpt.getDeptNo());
	}
}
