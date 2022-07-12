package com.yogesh.persistence;

import java.util.HashSet;

import java.util.Map;

import com.yogesh.bean.Employee;
import com.yogesh.bean.Project;
import com.yogesh.database.ProjectDataSource;
import com.yogesh.database.ProjectEmployeeDataSource;

public class ProjectEmployeesDaoImpl implements IProjectEmployee {
	private IProjectDao productDao = new ProjectDaoImpl();

	@Override
	public boolean allocate(Employee emp, Project pro) {
		Map<Project, HashSet<Employee>> mp = ProjectEmployeeDataSource.getProjectEmployee();
		Project proj = ProjectDataSource.getProjectList().get(0);
		
		HashSet<Employee> tempEmp = mp.get(proj);

		if (tempEmp.contains(emp)) {
			tempEmp.remove(emp);
			mp.put(proj, tempEmp);
			System.out.println(mp.get(proj).size());
			
			
			HashSet<Employee> tempEmp1 = new HashSet<Employee>();
			
			if (mp.containsKey(pro)) {
				tempEmp1 = mp.get(pro);
				
			} 
			tempEmp1.add(emp);
			mp.put(pro, tempEmp1);
			ProjectEmployeeDataSource.setProjectEmployee(mp);
			System.out.println(mp.get(proj).size());
			return true;

		}

		return false;
	}

	@Override
	public boolean dellocate(Employee emp, Project pro) {
		Map<Project, HashSet<Employee>> mp = ProjectEmployeeDataSource.getProjectEmployee();
		HashSet<Employee> tempEmp=new HashSet<Employee>();;
		if (mp.containsKey(pro))
			tempEmp = mp.get(pro);

		if (tempEmp.contains(emp)) {
			tempEmp.remove(emp);
			mp.put(pro, tempEmp);
			Project proj = ProjectDataSource.getProjectList().get(0);

			tempEmp = mp.get(proj);

			tempEmp.add(emp);
			mp.put(proj, tempEmp);
			return true;
		}

		return false;

	}

	@Override
	public HashSet<Employee> getEmployeesByProjectID(Project pro) {
		Map<Project, HashSet<Employee>> mp = ProjectEmployeeDataSource.getProjectEmployee();

		return mp.get(pro);
	}
}
