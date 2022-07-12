package com.yogesh.service;

import java.util.ArrayList;


import com.yogesh.bean.Project;

public interface IProjectService {
	Project searchRecordById(int empId);

	ArrayList<Project> getAllRecords();
}
