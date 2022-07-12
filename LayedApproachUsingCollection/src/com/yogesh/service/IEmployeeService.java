package com.yogesh.service;

import java.util.ArrayList;


import com.yogesh.bean.Employee;

public interface IEmployeeService {
	Employee searchRecordById(int empId);
	ArrayList<Employee> getAllRecords(); 
}
