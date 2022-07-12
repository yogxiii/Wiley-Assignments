package com.yogesh.service;

import java.util.ArrayList;


import com.yogesh.bean.Employee;
import com.yogesh.persistence.EmployeeDaoImpl;
import com.yogesh.persistence.IEmployeeDao;

public class EmployeeServiceImpl implements IEmployeeService {
	private IEmployeeDao employeeDao = new EmployeeDaoImpl();
	@Override
	public Employee searchRecordById(int empId) {
		// TODO Auto-generated method stub
		return employeeDao.searchRecordById(empId);
	}

	@Override
	public ArrayList<Employee> getAllRecords() {
		// TODO Auto-generated method stub
		return employeeDao.getAllRecords();
	}

}
