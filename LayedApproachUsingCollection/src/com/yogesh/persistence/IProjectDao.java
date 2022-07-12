package com.yogesh.persistence;

import java.util.ArrayList;


import com.yogesh.bean.Project;

public interface IProjectDao {
	Project searchRecordById(int empId);

	ArrayList<Project> getAllRecords();
}
