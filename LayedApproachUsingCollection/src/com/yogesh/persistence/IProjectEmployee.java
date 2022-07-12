package com.yogesh.persistence;

import java.util.HashSet;


import com.yogesh.bean.Employee;
import com.yogesh.bean.Project;

public interface IProjectEmployee {
boolean allocate(Employee emp,Project pro);

boolean dellocate(Employee emp, Project pro);

HashSet<Employee> getEmployeesByProjectID(Project pro);
}
