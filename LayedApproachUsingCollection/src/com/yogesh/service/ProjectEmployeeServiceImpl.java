package com.yogesh.service;

import java.util.HashSet;


import com.yogesh.bean.Employee;
import com.yogesh.bean.Project;
import com.yogesh.persistence.IProjectEmployee;
import com.yogesh.persistence.ProjectEmployeesDaoImpl;

public class ProjectEmployeeServiceImpl implements IProjectEmployeeService {
	IProjectEmployee pedao = new ProjectEmployeesDaoImpl();

	@Override
	public boolean allocate(Employee emp, Project pro) {
		return pedao.allocate(emp, pro);
	}

	@Override
	public boolean dellocate(Employee emp, Project pro) {
		return pedao.dellocate(emp, pro);
	}

	@Override
	public HashSet<Employee> getEmployeesByProjectID(Project pro) {
		return pedao.getEmployeesByProjectID(pro);
	}

}
