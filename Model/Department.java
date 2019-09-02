package com.Employee.demo.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Department {
	
	private Long DeptNo;
	private String DeptName;
	
	Set <DeptEmp> dpep = new HashSet<DeptEmp>();
	
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	@Id
	public Long getDeptNo() {
		return DeptNo;
	}
	@OneToMany(mappedBy = "dept")
	public Set<DeptEmp> getDpep() {
		return dpep;
	}
	public void setDeptNo(Long deptNo) {
		DeptNo = deptNo;
	}
	public void setDpep(Set<DeptEmp> dpep) {
		this.dpep = dpep;
	}
	public void addDeptEmp(DeptEmp deptemp) {
		this.dpep.add(deptemp);
	}
	
}
