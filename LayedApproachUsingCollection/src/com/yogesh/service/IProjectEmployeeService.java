package com.yogesh.service;
import java.util.*;

import com.yogesh.bean.Employee;
import com.yogesh.bean.Project;

public interface IProjectEmployeeService {
	boolean allocate(Employee emp, Project pro);

	boolean dellocate(Employee emp, Project pro);

	HashSet<Employee> getEmployeesByProjectID(Project pro);
}
