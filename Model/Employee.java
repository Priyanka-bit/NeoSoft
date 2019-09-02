package com.Employee.demo.Model;
import java.sql.Date;
import java.util.*;

import javax.annotation.*;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


enum Gender{Male,Female}
@Entity(name ="Employee")
public class Employee 
{
	
	
	private int EmpNo;
	@Column
	private String FirstName;
	@Column
	private String LastName;
	Gender gen ;
	Date BirthDate;
	Date HireDate;
	
	Set <DeptEmp> dpep = new HashSet<DeptEmp>();
	
	public Date getHireDate() {
		return HireDate;
	}
	public Date getBirthDate() {
		return BirthDate;
	}
	@Enumerated(EnumType.STRING)
	public Gender getGen() {
		return gen;
	}
	public String getLastName() {
		return LastName;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setGen(Gender gen) {
		this.gen = gen;
	}
	public void setHireDate(Date hireDate) {
		HireDate = hireDate;
	}
	@OneToMany(mappedBy = "emp")
	public Set<DeptEmp> getDpep() {
		return dpep;
	}
	public void setDpep(Set<DeptEmp> dpep) {
		this.dpep = dpep;
	}
	public void addDeptEmp(DeptEmp deptemp) {
		this.dpep.add(deptemp);
	}
}
