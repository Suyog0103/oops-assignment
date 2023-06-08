package com.demo.dao;

import com.demo.beans.Employee;
import java.util.List;
import java.util.ArrayList;

public interface EmpDaoInter {
	
	void save(Employee e);
	
	List<Employee> display();
	
	Employee findById(int i);
	
	List<Employee> findByName(String name);
		
	List<Employee> sortBySal();
	
	boolean modifySal(int id, int sal);
	
	boolean deleteById(int id);
}
