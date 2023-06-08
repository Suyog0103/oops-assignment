package com.demo.dao;

import com.demo.beans.Employee;
import java.util.List;
import java.util.ArrayList;

public interface EmpDaoInter {
	
	public void save(Employee e);
	
	public List<Employee> display();
	
	public Employee findById(int i);
	
	public List<Employee> findByName(String name);
		
}
