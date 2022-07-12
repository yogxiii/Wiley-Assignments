package com.yogesh.persistence;

import java.util.ArrayList;

import java.util.List;

import com.yogesh.bean.Project;
import com.yogesh.database.ProjectDataSource;

public class ProjectDaoImpl implements IProjectDao {

	@Override
	public Project searchRecordById(int prodId) {

		List<Project> project = ProjectDataSource.getProjectList();
		for (Project p : project) {
			if (p.getProjectId() == prodId)
				return p;
		}
		return null;
	}

	@Override
	public ArrayList<Project> getAllRecords() {

		return ProjectDataSource.getProjectList();
	}

}
