package com.Employee.demo.Model;

import javax.persistence.*;

import java.io.Serializable;
import java.sql.Date;
@Entity
public class DeptEmp implements Serializable {
	
	
	Employee emp;
	
	Department dept;
	
	Date FromDate;
	Date ToDate;
	
	public Date getFromDate() {
		return FromDate;
	}
	public Date getToDate() {
		return ToDate;
	}
	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DeptNo")
	public Department getDept() {
		return dept;
	}
	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "EmpNo")
	public Employee getEmp() {
		return emp;
	}
	public void setToDate(Date toDate) {
		ToDate = toDate;
	}
	public void setFromDate(Date fromDate) {
		FromDate = fromDate;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
}
