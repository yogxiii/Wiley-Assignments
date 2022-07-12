package com.yogesh.lombok;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee  = new Employee("Yogesh",123,500000);
		System.out.println(employee);
		employee.setEmpName("Himanshu");
		System.out.println(employee);

	}

}
