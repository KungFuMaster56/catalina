package org.kevin.catalina.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.kevin.catalina.entity.Department;
import org.kevin.catalina.mapper.DepartmentMapper;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("department")
public class DepartmentController {
	
	@Resource
	private DepartmentMapper department;
	
	@GetMapping
	public List<Department> treeView(){
		List<Department> data =department.getAll();//查询数据库中的数据
		List<Department> result = new ArrayList<Department>();//最终符合treeview数据结构的数据
		for(Department d :data) { //找节点集合
			String key = d.getDepartment_key();
			List<Department> nodes =new ArrayList<Department>();
			for(Department dd : data) {
				if(key.equals(dd.getParent_departmentkey())) {
					nodes.add(dd);
				}
			}
			if(nodes.isEmpty()) {
				nodes=null;//无子节点，去掉加号
			}
				d.setNodes(nodes);
		}
		for(Department p : data) {//找父级
			if(p.getParent_departmentkey().equals("#")) {
				result.add(p);
			}
		}
		return result;
	}
	
	@PostMapping
	public Map<String,Object> addNode(@RequestBody Department dep){
		Map<String,Object> result=new HashMap<String,Object>();
		dep.setDepartment_key(String.valueOf(department.maxKey()+1));
		Integer effect = department.addNode(dep);
		result.put("effect", effect);
		return result;
	}

	@PutMapping
	public Map<String,Object> eidtNode(@RequestBody Department dep){
		Map<String,Object> result=new HashMap<String,Object>();
		Integer effect = department.editNode(dep);
		result.put("effect", effect);
		return result;
	}
	
	@DeleteMapping
	public Map<String,Object> delNode(@RequestBody Department dep){
		Map<String,Object> result=new HashMap<String,Object>();
		Integer effect = department.delNode(dep);
		result.put("effect", effect);
		return result;
	}
}
