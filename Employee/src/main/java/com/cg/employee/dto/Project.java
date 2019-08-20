package com.cg.employee.dto;

public class Project {
	
	private Integer projId;
	private String projName;
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public Project(Integer projId, String projName) {
		super();
		this.projId = projId;
		this.projName = projName;
	}
	public Project() {
		super();
	}
	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projName=" + projName + "]";
	}
	

}
