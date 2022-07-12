package com.yogesh.database;
import com.yogesh.bean.Employee;
import com.yogesh.bean.Project;
import java.util.*;
public class ProjectEmployeeDataSource {
	static Map<Project,HashSet<Employee>> ProjectEmployee = new HashMap<Project,HashSet<Employee>>();
	
	static {
		
		List<Project> proj  = ProjectDataSource.getProjectList(); 
		
		List<Employee> emp =EmployeeDataSource.getEmployeeList();
		
		HashSet<Employee> emp1 = new HashSet<Employee>();
		
		emp1.addAll(emp);
		ProjectEmployee.put(proj.get(0), emp1);
	}

	public static Map<Project, HashSet<Employee>> getProjectEmployee() {
		return ProjectEmployee;
	}

	public static void setProjectEmployee(Map<Project, HashSet<Employee>> projectEmployee) {
		ProjectEmployee = projectEmployee;
	}
	

}
