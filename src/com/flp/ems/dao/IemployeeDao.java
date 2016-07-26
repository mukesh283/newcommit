package com.flp.ems.dao;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {
	public void AddEmployee(Employee e);
	public void ModifyEmployee(Employee e);
	public void RemoveEmployee(String e);
	public void SearchEmployee(String s);
	public void getAllEmployee();
}
