package com.yogesh.treenap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemoMain {

	public static void main(String[] args) {
		TreeMap<Employee, Project> map = new TreeMap<Employee, Project>();
		Employee e1 = new Employee(101, "Yogesh", 2);
		Employee e2 = new Employee(102, "Aanchal", 1);
		Employee e3 = new Employee(103, "Adarsh", 4);
		Employee e4 = new Employee(104, "Anjali", 3);
		Employee e5 = new Employee(105, "Hamza", 5);
		Project p1 = new Project(101, "Employee Management");
		Project p2 = new Project(102, "Resource Management");

		map.put(e1, p1);
		map.put(e2, p2);
		map.put(e3, p1);
		map.put(e4, p2);
		map.put(e5, p1);
		
		Set<Employee> employees = map.keySet();
		for (Employee emp : employees) {
			System.out.println(emp +" ="+map.get(emp));
		}
	}

}
