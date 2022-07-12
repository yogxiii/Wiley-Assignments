package com.yogesh.service;

import java.util.ArrayList;


import com.yogesh.bean.Project;
import com.yogesh.persistence.IProjectDao;
import com.yogesh.persistence.ProjectDaoImpl;

public class ProjectServiceImpl implements IProjectService {
	private IProjectDao productDao = new ProjectDaoImpl();
	@Override
	public Project searchRecordById(int empId) {
		return productDao.searchRecordById(empId);
	}

	@Override
	public ArrayList<Project> getAllRecords() {
		return productDao.getAllRecords();
	}

}
