package com.yogesh.database;

import java.util.ArrayList;


import com.yogesh.bean.Project;

public class ProjectDataSource {
	private static ArrayList<Project> projectList=new ArrayList<Project>();
	static {
		projectList.add(new Project(101, "Bench"));
		projectList.add(new Project(102, "project2"));
		projectList.add(new Project(103, "project3"));
		projectList.add(new Project(104, "project4"));
		projectList.add(new Project(105, "project5"));
	}
	public static ArrayList<Project> getProjectList() {
		return projectList;
	}
	public static void setProjectList(ArrayList<Project> projectList) {
		ProjectDataSource.projectList = projectList;
	}
	
}
