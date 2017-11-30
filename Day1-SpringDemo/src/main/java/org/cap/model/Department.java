package org.cap.model;

public class Department {
	
	private int depId;
	private String departName;
	
	public Department(){
		
	}
	
	public Department(int depId, String departName) {
		super();
		this.depId = depId;
		this.departName = departName;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	@Override
	public String toString() {
		return "Department [depId=" + depId + ", departName=" + departName + "]";
	}
	
	

}
