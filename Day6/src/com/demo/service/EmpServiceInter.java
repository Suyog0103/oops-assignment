package com.demo.service;

import java.util.List;
import java.util.ArrayList;

import com.demo.beans.Employee;

public interface EmpServiceInter {
	
	void addEmp();

	List<Employee> displayAll();
	
	Employee displayById(int i); 
	
	List<Employee> displayByName(String name);
	

	

}
