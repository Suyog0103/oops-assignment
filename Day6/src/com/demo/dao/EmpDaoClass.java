package com.demo.dao;

import com.demo.beans.Employee;
import java.util.List;
import java.util.ArrayList;

public class EmpDaoClass implements EmpDaoInter{
	
	private static List<Employee> elist;
	
	static{
		elist= new ArrayList<>();
		elist.add(new Employee(1, "suyog", "Developer", 88888));
		elist.add(new Employee(2, "tarun", "Techie", 100000000));
		elist.add(new Employee(3, "squirtle", "IT all rounder", 151515515));
	}
	
	public void save(Employee e)
	{
		elist.add(e);
	}
	
	public List<Employee> display()
	{
		return elist;
//		for(int i=0; i<elist.size(); i++)
//			System.out.println(elist.get(i));
	}
	
	public Employee findById(int id)
	{
		System.out.println("in employee");
		int pos = elist.indexOf(new Employee(id));
		if(pos!=-1)
		{
			System.out.println("in if");
			return elist.get(pos);
		}
		return null;
	}
	
	public List<Employee> findByName(String name)
	{
		List<Employee> ll = new ArrayList<>(); 
		for(int i=0; i<elist.size(); i++)
		{
//			System.out.println(elist.get(i).getEmpname());
			Employee ee = elist.get(i);
			if(ee.getEmpname().equals(name))
				{
					ll.add(elist.get(i));
				}
		}
		if(ll.size()>0)
			return ll;
		else
			return null;
		
//		List<Employee> findlst=new ArrayList<>();
//		for(Employee  ob:elist) {
//			if(ob.getEmpname().equals(name)) {
//				findlst.add(ob);
//			}
//			
//		}
//		if(findlst.size()>0) {
//			return findlst;
//		}
//		return null;
	}
	

}
