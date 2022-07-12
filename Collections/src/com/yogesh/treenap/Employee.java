package com.yogesh.treenap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private int empExperience;
	@Override
	public int compareTo(Employee o) {
		if(empExperience>o.empExperience)
			return 1;
		else if(empExperience<o.empExperience)
			return -1;
		else if(this.equals(o))
			return 0;
		return 1;
	}
}
