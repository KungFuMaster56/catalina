package org.kevin.catalina.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.kevin.catalina.entity.Department;

public interface DepartmentMapper {
	
	@Select("SELECT department_key,department_value,parent_departmentkey FROM sys_department")
	List<Department> getAll();
	
	@Insert("INSERT INTO sys_department(department_key,department_value,description,parent_departmentkey) VALUES(#{department_key},#{department_value},#{description},#{parent_departmentkey})")
	Integer addNode(Department department);
	
	@Select("SELECT MAX(department_key) FROM sys_department")
	Integer maxKey();

}
