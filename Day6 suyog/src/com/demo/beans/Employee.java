package com.demo.beans;

public class Employee implements Comparable<Employee>{

	private int empid;
	private String empname;
	private String desg;
	private int sal;
	
	public Employee() {
		super();
	}

	public Employee(int empid,  String empname, String desg, int sal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.desg = desg;
		this.sal = sal;
	}
	
	public Employee(int id)
	{
		super();
		this.empid=id;
		this.empname = null;
		this.desg = null;
		this.sal = 0;
		
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "Employee [empid: " + empid + ", empname: " + empname + ", desg: " + desg + ", sal: " + sal + "]";
	}
	@Override
	public boolean equals(Object ob)
	{
		System.out.println("in equals");
		return this.empid==((Employee)ob).empid;
	}
	
	public int compareTo(Employee ee)
	{
		if(this.sal<ee.sal)
		{
			return -1;
		}else if(this.sal==ee.sal)
		{
			return 0;
		}else
		{
			return 1;
		}
		
//		return this.sal-ee.sal;
//		return this.name.compareTo(ee.name);
	}
	
	
	
}
