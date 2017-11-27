package org.kevin.catalina.entity;

import java.util.List;

public class Department {
	
	private String department_key;
	
	private String department_value;
	
	private String parent_departmentkey;
	
	private String description;
	
	private String parent_departmenvalue;
	
	private String text;
	
	private String id;
	
	private List<Department> nodes;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Department> getNodes() {
		return nodes;
	}

	public void setNodes(List<Department> nodes) {
		this.nodes = nodes;
	}

	public String getDepartment_key() {
		return department_key;
	}

	public void setDepartment_key(String department_key) {
		this.department_key = department_key;
		this.id = department_key;
	}

	public String getDepartment_value() {
		return department_value;
	}

	public void setDepartment_value(String department_value) {
		this.department_value = department_value;
		this.text = department_value;
	}

	public String getParent_departmentkey() {
		return parent_departmentkey;
	}

	public void setParent_departmentkey(String parent_departmentkey) {
		this.parent_departmentkey = parent_departmentkey;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getParent_departmenvalue() {
		return parent_departmenvalue;
	}

	public void setParent_departmenvalue(String parent_departmenvalue) {
		this.parent_departmenvalue = parent_departmenvalue;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
