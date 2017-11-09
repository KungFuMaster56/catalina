package org.kevin.catalina.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.kevin.catalina.entity.Department;

public interface DepartmentMapper {
	
	@Select("SELECT a.department_key,a.department_value,a.parent_departmentkey,a.description,b.department_value as parent_departmenvalue FROM sys_department a LEFT JOIN sys_department b ON a.parent_departmentkey=b.department_key")
	List<Department> getAll();
	
	@Insert("INSERT INTO sys_department(department_key,department_value,description,parent_departmentkey) VALUES(#{department_key},#{department_value},#{description},#{parent_departmentkey})")
	Integer addNode(Department department);
	
	@Select("SELECT MAX(department_key) FROM sys_department")
	Integer maxKey();

	@Update("UPDATE sys_department set department_value=#{department_value},description=#{description} WHERE department_key=#{department_key}")
	Integer editNode(Department department);
	
	@Delete("DELETE FROM sys_department WHERE (department_key=#{department_key} OR parent_departmentkey=#{department_key}) ")
	Integer delNode(Department department);
}
