package com.Employee.demo.Controller;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import com.Employee.demo.Model.Department;
import com.Employee.demo.Model.Employee;
import com.Employee.demo.Service.DepartmentService;
import com.Employee.demo.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empser;
	@Autowired
	DepartmentService dptser;
	
	@RequestMapping(value = "/add/", method = RequestMethod.POST)
	public String addEmployee(Employee emp) {
		empser.add(emp);
		return "Done";
	}
	
	
	@RequestMapping(value = "/add/Department", method = RequestMethod.POST)
	public String addDepartment(Department dpt) {
		dptser.add(dpt);
		return "Done";
	}
	
	@RequestMapping(value = "/get/{Id}", method = RequestMethod.POST)
	public String getEmployee(@PathVariable Long Id) {
		empser.getEmp(Id);
		return "Done";
	}
	

}
