package com.demo.service;
import com.demo.beans.Employee;
import com.demo.dao.EmpDaoInter;
import com.demo.dao.EmpDaoClass;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EmpServiceClass implements EmpServiceInter{
	Scanner sc = new Scanner(System.in);
	EmpDaoInter ob;
	public EmpServiceClass()
	{
		super();
		ob = new EmpDaoClass();
	}
	
	public void addEmp()
	{
		Employee e;
		System.out.println("Enter Emp ID");
		int a= sc.nextInt();
		System.out.println("Enter Name");
		String b = sc.next();
		System.out.println("Enter Designation");
		String c = sc.next();
		System.out.println("Enter Sal");
		int d = sc.nextInt();
		
		e= new Employee(a, b, c, d);
		ob.save(e);
	}
	
	public List<Employee> displayAll()
	{
		return ob.display();
	}
	
	public Employee displayById(int i)
	{
		System.out.println("in");
		return ob.findById(i);
	}
	
	public List<Employee> displayByName(String name)
	{
		return ob.findByName(name);
	}
	
	public List<Employee> sortBySal()
	{
		return ob.sortBySal();
	}
	
	public boolean modifySal(int id, int sal)
	{
		return ob.modifySal(id, sal);
	}
	
	
	
}
