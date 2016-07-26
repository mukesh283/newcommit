package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.Iterator;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao {
	
	
	static ArrayList<Employee> arrlist=new ArrayList<Employee>();
	
	public void AddEmployee(Employee e){
		arrlist.add(e);
		System.out.println("Employee added");
		
	}
	public void ModifyEmployee(Employee e){
		Employee temp=null;
		for(Employee emp:arrlist)
		{
			if(emp.equals(e.getKin_id()))
				temp=emp;
		}
		if(e.getName()!=null)
			{
				temp.setName(e.getName());
				System.out.println("Name Modified");
			}
		else if(e.getEmail_id()!=null)
			{
				temp.setEmail_id(e.getEmail_id());
				System.out.println("Email id Modified");
			}
		else if(e.getPhone_no()!=null)
			{
				temp.setPhone_no(e.getPhone_no());
				System.out.println(" Phone no Modified");
			}
		else if(e.getDate_of_birth()!=null)
			{
				temp.setDate_of_birth(e.getDate_of_birth());
			}	
		else if(e.getDate_of_Joining()!=null)
			{
				temp.setDate_of_Joining(e.getDate_of_Joining());
			}
		else if(e.getAddress()!=null)
		{
			temp.setAddress(e.getAddress());
		}
	}	
		
	public void RemoveEmployee(String Kin_id){
		//Iterator itr=arrlist.iterator();
		Employee e=null;
		for(Employee emp:arrlist)
		{
			if(emp.equals(Kin_id))
				e=emp;
		}
		if(e!=null)
		{arrlist.remove(e);
		System.out.println("Employee Removed");}
		else
		System.out.println("Kin_id does'nt exists");
	}
		
	public void SearchEmployee(String search)
	{
		//Employee e=null;
		for(Employee emp:arrlist)
		{	 
			String Email_id=emp.getEmail_id();
			String Kin_id=emp.getKin_id();
			String Name=emp.getName();
			if(Email_id.equals(search)|| Kin_id.equals(search)|| Name.equals(search))
				System.out.println(emp);
		}
			//if(e!=null)
			//System.out.println(e);
		}
	
	public void getAllEmployee()
	{
		for(Employee emp:arrlist)
		{
			System.out.println(emp);
			System.out.println(emp.getDepartment());
			System.out.println(emp.getProject());
			System.out.println(emp.getRole());
		}
		
	}

	
}
