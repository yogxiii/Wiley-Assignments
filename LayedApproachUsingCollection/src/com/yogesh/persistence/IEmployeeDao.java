package com.yogesh.persistence;

import java.util.ArrayList;


import com.yogesh.bean.Employee;

public interface IEmployeeDao {
	Employee searchRecordById(int empId);
	ArrayList<Employee> getAllRecords(); 
}
