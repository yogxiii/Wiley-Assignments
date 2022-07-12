package com.yogesh.hash;

import java.util.HashMap;
import java.util.Map;

public class HashMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101, "AAAA");
		Employee emp2 = new Employee(102, "BBBB");
		Project pr1 = new Project(1, "AI");
		Project pr2 = new Project(2, "ML");
		Map<Employee, Project> demoHashMap =new HashMap<Employee, Project>();
		
		demoHashMap.put(emp1, pr1);
		demoHashMap.put(emp2, pr2);
		demoHashMap.put(emp2, pr2);
		System.out.println(demoHashMap);
		


	}

}