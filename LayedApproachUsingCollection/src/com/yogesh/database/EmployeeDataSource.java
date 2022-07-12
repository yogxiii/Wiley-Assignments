package com.yogesh.database;

import java.util.ArrayList;

import com.yogesh.bean.Employee;

public class EmployeeDataSource {
	protected static ArrayList<Employee> employeeList=new ArrayList<Employee>();
	static {
		employeeList.add(new Employee(101, "Ashima", "Associate", "IT", 55000));
		employeeList.add(new Employee(102, "Bharat", "Associate", "IT", 55000));
		employeeList.add(new Employee(104, "Nitin", "Associate", "IT", 55000));
		employeeList.add(new Employee(103, "Ankait", "Associate", "IT", 55000));
		employeeList.add(new Employee(105, "Sikesh", "Associate", "IT", 55000));
		
		employeeList.add(new Employee(106, "Naitik", "Associate", "IT", 55000));
		employeeList.add(new Employee(107, "Meena", "Associate", "IT", 55000));
		employeeList.add(new Employee(109, "Vibha", "Associate", "IT", 55000,8));
		employeeList.add( new Employee(110, "Dheeraj", "Associate", "IT", 55000,5));
		employeeList.add(new Employee(111,"Yogesh","SDE","GE",50000,2));
		
		
	}
	public static ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public static void setEmployeeList(ArrayList<Employee> employeeList) {
		EmployeeDataSource.employeeList = employeeList;
	}
	
}
