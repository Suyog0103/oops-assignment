package com.demo.test;
import java.util.Scanner;
import java.util.List;

import com.demo.beans.Employee;
import com.demo.service.EmpServiceClass;
import com.demo.service.EmpServiceInter;

public class TestEmployee {

	public static void main(String[] args) {
		EmpServiceInter emp = new EmpServiceClass();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do{
			System.out.println("Enter the Number\n");
			System.out.println("1. Add Employee\n"
					+ "2. Display All Employee\n"
					+ "3. Display by id\n"
					+ "4. Display by name\n"
					+ "5. Sort by salary\n"
					+ "6. Modify salary\n"
					+ "7. Delete by Id\n"
					+ "8. Exit");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1: emp.addEmp();
					break;
					
				case 2:
					List<Employee> ss = emp.displayAll();
					for(int i=0; i<ss.size(); i++)
						System.out.println(ss.get(i));
					break;
					
				case 3:
					System.out.println("Enter ID: ");
					int idd= sc.nextInt();
					Employee e= emp.displayById(idd);
					if(e!=null)
					{
						System.out.println(e);
					}
					else
					{
						System.out.println("Id not found");
					}
					break;
					
				case 4:
					System.out.println("Enter Name: ");
					String name= sc.next();
					List<Employee> ll= emp.displayByName(name);
					if(ll!=null)
					{
						ll.forEach(a->{System.out.println(a);});
					}
					else
					{
						System.out.println("Id not found");
					}
					break;
					
				case 8: 
					sc.close();
					System.out.println("Thanks for visiting!!!!");
					break;
			
			}
		}while(choice != 8);
		
		
	
		

	}

}
